
package cn.edu.xmu.provider.model.po;

import java.time.LocalDateTime;

public class PreSalePo {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column presale_activity.id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column presale_activity.name
     *
     * @mbg.generated
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column presale_activity.begin_time
     *
     * @mbg.generated
     */
    private LocalDateTime beginTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column presale_activity.pay_time
     *
     * @mbg.generated
     */
    private LocalDateTime payTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column presale_activity.end_time
     *
     * @mbg.generated
     */
    private LocalDateTime endTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column presale_activity.state
     *
     * @mbg.generated
     */
    private Byte state;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column presale_activity.shop_id
     *
     * @mbg.generated
     */
    private Long shopId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column presale_activity.goods_sku_id
     *
     * @mbg.generated
     */
    private Long goodsSkuId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column presale_activity.quantity
     *
     * @mbg.generated
     */
    private Integer quantity;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column presale_activity.advance_pay_price
     *
     * @mbg.generated
     */
    private Long advancePayPrice;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column presale_activity.rest_pay_price
     *
     * @mbg.generated
     */
    private Long restPayPrice;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column presale_activity.gmt_create
     *
     * @mbg.generated
     */
    private LocalDateTime gmtCreate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column presale_activity.gmt_modified
     *
     * @mbg.generated
     */
    private LocalDateTime gmtModified;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column presale_activity.id
     *
     * @return the value of presale_activity.id
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column presale_activity.id
     *
     * @param id the value for presale_activity.id
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column presale_activity.name
     *
     * @return the value of presale_activity.name
     *
     * @mbg.generated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column presale_activity.name
     *
     * @param name the value for presale_activity.name
     *
     * @mbg.generated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column presale_activity.begin_time
     *
     * @return the value of presale_activity.begin_time
     *
     * @mbg.generated
     */
    public LocalDateTime getBeginTime() {
        return beginTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column presale_activity.begin_time
     *
     * @param beginTime the value for presale_activity.begin_time
     *
     * @mbg.generated
     */
    public void setBeginTime(LocalDateTime beginTime) {
        this.beginTime = beginTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column presale_activity.pay_time
     *
     * @return the value of presale_activity.pay_time
     *
     * @mbg.generated
     */
    public LocalDateTime getPayTime() {
        return payTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column presale_activity.pay_time
     *
     * @param payTime the value for presale_activity.pay_time
     *
     * @mbg.generated
     */
    public void setPayTime(LocalDateTime payTime) {
        this.payTime = payTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column presale_activity.end_time
     *
     * @return the value of presale_activity.end_time
     *
     * @mbg.generated
     */
    public LocalDateTime getEndTime() {
        return endTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column presale_activity.end_time
     *
     * @param endTime the value for presale_activity.end_time
     *
     * @mbg.generated
     */
    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column presale_activity.state
     *
     * @return the value of presale_activity.state
     *
     * @mbg.generated
     */
    public Byte getState() {
        return state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column presale_activity.state
     *
     * @param state the value for presale_activity.state
     *
     * @mbg.generated
     */
    public void setState(Byte state) {
        this.state = state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column presale_activity.shop_id
     *
     * @return the value of presale_activity.shop_id
     *
     * @mbg.generated
     */
    public Long getShopId() {
        return shopId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column presale_activity.shop_id
     *
     * @param shopId the value for presale_activity.shop_id
     *
     * @mbg.generated
     */
    public void setShopId(Long shopId) {
        this.shopId = shopId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column presale_activity.goods_sku_id
     *
     * @return the value of presale_activity.goods_sku_id
     *
     * @mbg.generated
     */
    public Long getGoodsSkuId() {
        return goodsSkuId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column presale_activity.goods_sku_id
     *
     * @param goodsSkuId the value for presale_activity.goods_sku_id
     *
     * @mbg.generated
     */
    public void setGoodsSkuId(Long goodsSkuId) {
        this.goodsSkuId = goodsSkuId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column presale_activity.quantity
     *
     * @return the value of presale_activity.quantity
     *
     * @mbg.generated
     */
    public Integer getQuantity() {
        return quantity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column presale_activity.quantity
     *
     * @param quantity the value for presale_activity.quantity
     *
     * @mbg.generated
     */
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column presale_activity.advance_pay_price
     *
     * @return the value of presale_activity.advance_pay_price
     *
     * @mbg.generated
     */
    public Long getAdvancePayPrice() {
        return advancePayPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column presale_activity.advance_pay_price
     *
     * @param advancePayPrice the value for presale_activity.advance_pay_price
     *
     * @mbg.generated
     */
    public void setAdvancePayPrice(Long advancePayPrice) {
        this.advancePayPrice = advancePayPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column presale_activity.rest_pay_price
     *
     * @return the value of presale_activity.rest_pay_price
     *
     * @mbg.generated
     */
    public Long getRestPayPrice() {
        return restPayPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column presale_activity.rest_pay_price
     *
     * @param restPayPrice the value for presale_activity.rest_pay_price
     *
     * @mbg.generated
     */
    public void setRestPayPrice(Long restPayPrice) {
        this.restPayPrice = restPayPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column presale_activity.gmt_create
     *
     * @return the value of presale_activity.gmt_create
     *
     * @mbg.generated
     */
    public LocalDateTime getGmtCreate() {
        return gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column presale_activity.gmt_create
     *
     * @param gmtCreate the value for presale_activity.gmt_create
     *
     * @mbg.generated
     */
    public void setGmtCreate(LocalDateTime gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column presale_activity.gmt_modified
     *
     * @return the value of presale_activity.gmt_modified
     *
     * @mbg.generated
     */
    public LocalDateTime getGmtModified() {
        return gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column presale_activity.gmt_modified
     *
     * @param gmtModified the value for presale_activity.gmt_modified
     *
     * @mbg.generated
     */
    public void setGmtModified(LocalDateTime gmtModified) {
        this.gmtModified = gmtModified;
    }

}