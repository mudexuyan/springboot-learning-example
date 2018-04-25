package edu.hfut.wangyu.dal;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * 用户实体类
 */

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class User extends BaseModel {
    /**
     * 主鍵
     */
    private Long id;
    /**
     * 密码
     */
    private String password;
    /**
     * 手机号，用于找回密码
     */
    private String phone;
    /**
     * 学号、教师职工号
     */
    private  String code;
    /**
     * 身份证号，用于验证学号是否正确
     */
    private String identifyCode;
    /**
     * 姓名
     */
    private String name;
    /**
     * 性别
     */
    private Integer sex;
    /**
     * 所在班级号
     */
    private String classCode;
    /**
     * 手机识别码（学生）
     */
    private String phoneCode;
    /**
     * 角色，0000-管理员，1111-学生，2222----教师
     */
    private Integer role;
}
