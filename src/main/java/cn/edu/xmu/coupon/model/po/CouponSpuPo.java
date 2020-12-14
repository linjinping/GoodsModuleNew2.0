package cn.edu.xmu.coupon.model.po;

import java.time.LocalDateTime;

public class CouponSpuPo {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column coupon_spu.id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column coupon_spu.activity_id
     *
     * @mbg.generated
     */
    private Long activityId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column coupon_spu.spu_id
     *
     * @mbg.generated
     */
    private Long spuId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column coupon_spu.gmt_created
     *
     * @mbg.generated
     */
    private LocalDateTime gmtCreated;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column coupon_spu.gmt_modified
     *
     * @mbg.generated
     */
    private LocalDateTime gmtModified;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column coupon_spu.id
     *
     * @return the value of coupon_spu.id
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column coupon_spu.id
     *
     * @param id the value for coupon_spu.id
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column coupon_spu.activity_id
     *
     * @return the value of coupon_spu.activity_id
     *
     * @mbg.generated
     */
    public Long getActivityId() {
        return activityId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column coupon_spu.activity_id
     *
     * @param activityId the value for coupon_spu.activity_id
     *
     * @mbg.generated
     */
    public void setActivityId(Long activityId) {
        this.activityId = activityId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column coupon_spu.spu_id
     *
     * @return the value of coupon_spu.spu_id
     *
     * @mbg.generated
     */
    public Long getSpuId() {
        return spuId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column coupon_spu.spu_id
     *
     * @param spuId the value for coupon_spu.spu_id
     *
     * @mbg.generated
     */
    public void setSpuId(Long spuId) {
        this.spuId = spuId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column coupon_spu.gmt_created
     *
     * @return the value of coupon_spu.gmt_created
     *
     * @mbg.generated
     */
    public LocalDateTime getGmtCreated() {
        return gmtCreated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column coupon_spu.gmt_created
     *
     * @param gmtCreated the value for coupon_spu.gmt_created
     *
     * @mbg.generated
     */
    public void setGmtCreated(LocalDateTime gmtCreated) {
        this.gmtCreated = gmtCreated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column coupon_spu.gmt_modified
     *
     * @return the value of coupon_spu.gmt_modified
     *
     * @mbg.generated
     */
    public LocalDateTime getGmtModified() {
        return gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column coupon_spu.gmt_modified
     *
     * @param gmtModified the value for coupon_spu.gmt_modified
     *
     * @mbg.generated
     */
    public void setGmtModified(LocalDateTime gmtModified) {
        this.gmtModified = gmtModified;
    }
}