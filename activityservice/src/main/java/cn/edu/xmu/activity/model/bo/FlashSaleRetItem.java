package cn.edu.xmu.activity.model.bo;


import cn.edu.xmu.activity.model.po.FlashSaleItemPo;
import cn.edu.xmu.activity.model.vo.FlashSaleRetItemVo;
import cn.edu.xmu.ooad.model.VoObject;

import java.time.LocalDateTime;

/**
 * @author LJP_3424
 * @create 2020-12-04 12:08
 */
public class FlashSaleRetItem implements VoObject {

    //private GoodsSkuItemVo goodsSkuItemVo;

    private Long id;

    private Long goodsSkuId;

    private Long price;

    private Integer quantity;

    private LocalDateTime gmtCreated;

    private LocalDateTime gmtModified;

    public FlashSaleRetItem(FlashSaleItemPo po) {
        id = po.getId();
        goodsSkuId = po.getGoodsSkuId();
        price = po.getPrice();
        quantity = po.getQuantity();
        gmtCreated = po.getGmtCreate();
        gmtModified = po.getGmtModified();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getGoodsSkuId() {
        return goodsSkuId;
    }

    public void setGoodsSkuId(Long goodsSkuId) {
        this.goodsSkuId = goodsSkuId;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public LocalDateTime getGmtCreated() {
        return gmtCreated;
    }

    public void setGmtCreated(LocalDateTime gmtCreated) {
        this.gmtCreated = gmtCreated;
    }

    public LocalDateTime getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(LocalDateTime gmtModified) {
        this.gmtModified = gmtModified;
    }

    @Override
    public Object createVo() {
        FlashSaleRetItemVo flashSaleRetItemVo = new FlashSaleRetItemVo();
        flashSaleRetItemVo.setGmtCreated(this.gmtCreated);
        flashSaleRetItemVo.setGmtModified(this.gmtModified);
        flashSaleRetItemVo.setGoodsSkuId(this.goodsSkuId);
        flashSaleRetItemVo.setId(this.id);
        flashSaleRetItemVo.setPrice(this.price);
        flashSaleRetItemVo.setQuantity(this.quantity);
        return flashSaleRetItemVo;
    }

    @Override
    public Object createSimpleVo() {
        return null;
    }
}
