package edu.hfut.wangyu.dal;
/**
 * 班级类，学生所属班级类，用于教师以班级为单位添加学生
 */
public class Class extends BaseModel {

    /**
     * 主鍵
     */
    private Long id;
    /**
     * 年届，2014届
     */
    private Integer yearCode;
    /**
     * 专业
     */
    private Integer projectCode;
    /**
     * 班级号
     */
    private Integer numberCode;
}
