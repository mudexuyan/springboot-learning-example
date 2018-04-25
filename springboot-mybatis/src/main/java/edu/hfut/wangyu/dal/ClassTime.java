package edu.hfut.wangyu.dal;

import java.util.Date;

/**
 * 用于教师设置上课时间
 */
public class ClassTime extends BaseModel {
    /**
     * 唯一id
     */
    private Long id;
    /**
     * 职工号
     */
    private Integer teacherCode;
    /**
     * 教室号
     */
    private Integer classRoomCode;
    /**
     * 用于设置一周的周几，1---周一，2--周二...7--周日
     */
    private Integer date;
    /**
     * 上课时间
     */
    private Date startClass;
    /**
     * 下课时间
     */
    private Date endClass;
    /**
     * 课程开始日期
     */
    private Date startTime;
    /**
     * 课程结束日期
     */
    private Date endTime;
    /**
     * 上课周期,0--天（用于老师临时调课），1--周
     */
    private Integer status;
}
