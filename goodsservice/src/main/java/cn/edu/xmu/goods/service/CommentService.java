package cn.edu.xmu.goods.service;

/**
 * @author Ruzhen Chang
 */

import cn.edu.xmu.goods.dao.CommentDao;
import cn.edu.xmu.goods.model.bo.Comment;
import cn.edu.xmu.goods.model.po.CommentPo;
import cn.edu.xmu.goods.model.vo.StateVo;
import cn.edu.xmu.ooad.model.VoObject;
import cn.edu.xmu.ooad.util.ResponseCode;
import cn.edu.xmu.ooad.util.ReturnObject;
import com.github.pagehelper.PageInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CommentService{
    @Autowired
    CommentDao commentDao;
    @Autowired
    GoodsSkuService goodsSkuService;

    private Logger logger= LoggerFactory.getLogger(CommentService.class);


    /**
     * @Description 新增sku评论
     */
    public ReturnObject newGoodsSkuComment(Comment comment) {
        ReturnObject ret = new ReturnObject();
        try{
            CommentPo commentPo= commentDao.newGoodsSkuComment(comment);
            comment.setId(commentPo.getId());
            VoObject retVo= comment.createRetVo();
            return new ReturnObject<>(retVo);
        }catch (Exception e){
            logger.error("发生了严重的服务器内部错误：" + e.getMessage());
            return new ReturnObject<>(ResponseCode.INTERNAL_SERVER_ERR);
        }
    }

    /**
     * @Description 由商品id获得评论列表
     */
    @Transactional
    public ReturnObject<PageInfo<VoObject>> getGoodsSkuCommentsList(Long goodsSkuId, Integer page, Integer pageSize){
        PageInfo<VoObject> retObj=null;
        try {
           return new ReturnObject<>(commentDao.getCommentListByGoodsSkuId(goodsSkuId,page,pageSize));
        } catch (Exception e) {
            logger.error("发生了严重的服务器内部错误ha：" + e.getMessage());
            return new ReturnObject<>(ResponseCode.INTERNAL_SERVER_ERR);
        }
    }


    /**
     * @Description 管理员审核评论
     * @author Ruzhen Chang
     */
    
    public ReturnObject auditComment(Comment comment) {
        ReturnObject returnObject=null;
        try{
            CommentPo commentPo=commentDao.getCommentById(comment.getId());
            if(commentPo == null){
                return new ReturnObject<>(ResponseCode.RESOURCE_ID_NOTEXIST,String.format("评论不存在 id: "+commentPo.getId()));
            }
            if(commentPo.getState() != (byte)Comment.State.NEW.getCode().intValue()){
                return new ReturnObject("The comment has been audited:" +commentPo.getId());
            }
            return commentDao.updateCommentState(comment);
        } catch (Exception e) {
            logger.error("发生了严重的服务器内部错误：" + e.getMessage());
            return new ReturnObject<>(ResponseCode.INTERNAL_SERVER_ERR);
        }
    }

    /**
     * @Description 查看自己的评论
     */
    
    public ReturnObject<PageInfo<VoObject>> getSelfCommentList(Long customerId, Integer page, Integer pageSize) {
        PageInfo<VoObject> retObj=null;
        try {
            return new ReturnObject<>(commentDao.getCommentListByCustomerId(customerId,page,pageSize));
        } catch (Exception e) {
            logger.error("发生了严重的服务器内部错误ha：" + e.getMessage());
            return new ReturnObject<>(ResponseCode.INTERNAL_SERVER_ERR);
        }
    }


    /**
     * @Description 查看已审核/未审核评论列表
     */
    
    public ReturnObject<PageInfo<VoObject>> getCommentListByShopId(Long shopId, Integer page, Integer pageSize) {
        PageInfo<VoObject> retObj=null;
        try {
            return new ReturnObject<>(commentDao.getCommentListByShopsId(shopId,page,pageSize));
        } catch (Exception e) {
            logger.error("发生了严重的服务器内部错误ha：" + e.getMessage());
            return new ReturnObject<>(ResponseCode.INTERNAL_SERVER_ERR);
        }
    }


    /**
     * @description 返回评论所有状态
     * @author Ruzhen Chang
     * @return
     */
    
    public ReturnObject<List<StateVo>> findCommentStates(){
        try{
            return new ReturnObject<>(commentDao.findCommentStates());
        }
        catch (Exception e){
            logger.error("发生了严重的服务器内部错误：" + e.getMessage());
            return new ReturnObject<>(ResponseCode.INTERNAL_SERVER_ERR);
        }

    }

}
