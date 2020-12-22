package cn.edu.xmu.otherservice.model.vo;

import lombok.Data;
import org.springframework.beans.factory.InitializingBean;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @author LJP_3424
 * @create 2020-12-23 5:06
 */
@Data
public class TimeSegmentVo implements Serializable {
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column time_segment.begin_time
     *
     * @mbg.generated
     */
    private LocalDateTime beginTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column time_segment.end_time
     *
     * @mbg.generated
     */
    private LocalDateTime endTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column time_segment.type
     *
     * @mbg.generated
     */
    private Byte type;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column time_segment.gmt_created
     *
     * @mbg.generated
     */
    private LocalDateTime gmtCreate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column time_segment.gmt_modified
     *
     * @mbg.generated
     */
    private LocalDateTime gmtModified;

    public TimeSegmentVo(){};
}