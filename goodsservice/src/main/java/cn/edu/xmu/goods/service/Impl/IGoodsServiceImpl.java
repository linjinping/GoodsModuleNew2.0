package cn.edu.xmu.goods.service.Impl;


import cn.edu.xmu.goods.dao.GoodsSkuDao;
import cn.edu.xmu.goods.dao.GoodsSpuDao;
import cn.edu.xmu.goods.dao.ShopDao;
import cn.edu.xmu.goods.model.po.GoodsSkuPo;
import cn.edu.xmu.goods.model.po.ShopPo;
import cn.edu.xmu.goodsservice.client.IGoodsService;
import cn.edu.xmu.goodsservice.model.bo.GoodsSku;
import cn.edu.xmu.goodsservice.model.bo.ShopSimple;
import cn.edu.xmu.ooad.util.ReturnObject;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
@DubboService
public class IGoodsServiceImpl implements IGoodsService {

    @Autowired
    GoodsSkuDao goodsSkuDao;

    @Autowired
    GoodsSpuDao goodsSpuDao;

    @Autowired
    ShopDao shopDao;

    @Transactional
    public GoodsSku getSkuById(Long id){
        ReturnObject<GoodsSkuPo> goodsSkuReturnObject = goodsSkuDao.getSkuById(id);
        GoodsSkuPo goodsSkuPo = goodsSkuReturnObject.getData();
        if(goodsSkuPo == null){
            return null;
        }
        GoodsSku goodsSku = new GoodsSku();
        goodsSku.setStatecode(goodsSkuPo.getState());
        goodsSku.setDetail(goodsSkuPo.getDetail());
        goodsSku.setDisabled(goodsSkuPo.getDisabled());
        goodsSku.setId(goodsSkuPo.getId());
        goodsSku.setImageUrl(goodsSkuPo.getImageUrl());
        goodsSku.setName(goodsSkuPo.getName());
        goodsSku.setGoodsSpuId(goodsSkuPo.getGoodsSpuId());
        goodsSku.setSkuSn(goodsSkuPo.getSkuSn());
        goodsSku.setOriginalPrice(goodsSkuPo.getOriginalPrice());
        goodsSku.setConfiguration(goodsSkuPo.getConfiguration());
        goodsSku.setWeight(goodsSkuPo.getWeight());
        goodsSku.setInventory(goodsSkuPo.getInventory());
        goodsSku.setGmtCreate(goodsSkuPo.getGmtCreate());
        goodsSku.setGmtModified(goodsSkuPo.getGmtModified());
        return goodsSku;
    }

    @Override
    public ShopSimple getSimpleShopById(Long id) {
        ShopPo shopPo = shopDao.getShopById(id);
        if(shopPo == null){
            return null;
        }
        ShopSimple shopSimple = new ShopSimple();
        shopSimple.setId(shopPo.getId());
        shopSimple.setShopName(shopPo.getName());
        return shopSimple;
    }
}
