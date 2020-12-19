package cn.edu.xmu.activity.mapper;

import cn.edu.xmu.activity.model.po.CouponActivityPo;
import cn.edu.xmu.activity.model.po.CouponActivityPoExample;
import java.util.List;

public interface CouponActivityPoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coupon_activity
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coupon_activity
     *
     * @mbg.generated
     */
    int insert(CouponActivityPo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coupon_activity
     *
     * @mbg.generated
     */
    int insertSelective(CouponActivityPo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coupon_activity
     *
     * @mbg.generated
     */
    List<CouponActivityPo> selectByExample(CouponActivityPoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coupon_activity
     *
     * @mbg.generated
     */
    CouponActivityPo selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coupon_activity
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(CouponActivityPo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coupon_activity
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(CouponActivityPo record);
}