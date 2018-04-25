package edu.hfut.wangyu.dal;

import lombok.*;
import lombok.experimental.Accessors;

import java.util.Date;

/**
 * 考勤记录表，主要的表之一
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)

public class Attendance extends BaseModel {
    /**
     * 编号
     */
    private Long id;
    /**
     * 学号--学生
     */
    private Integer studentCode;
    /**
     * 职工号--教师
     */
    private Integer teacherCode;
    /**
     * 考勤时间
     */
    private Date attendTime;
    /**
     * 考勤位置
     */
    private String attendPosition;
    /**
     * 手机识别码
     */
    private String phoneCode;
    /**
     * 考勤状态，1--正常，2--请假，3--时间异常，4--地点异常，5--手机异常
     */
    private Integer status;
}
