package edu.hfut.wangyu.dal;

/**
 * 教室类，用于教师设定教室，加入该门课的学生
 */
public class ClassRoom extends BaseModel {
    /**
     * 编号
     */
    private Long id;
    /**
     * 教室名（课程名）
     */
    private String className;
    /**
     * 学号--学生
     */
    private Integer studentCode;
    /**
     * 职工号--教师
     */
    private Integer teacherCode;

}
