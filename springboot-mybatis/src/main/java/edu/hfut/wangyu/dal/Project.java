package edu.hfut.wangyu.dal;

import lombok.*;
import lombok.experimental.Accessors;

/**
 * 专业类，管理员维护，用于学生设置所在班级
 */

@EqualsAndHashCode(callSuper = true)
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class Project extends BaseModel{


    private Long id;
    /**
     * 专业名称
     */
    private String name;
    /**
     * 所属系别，信息工程系
     */
    private Long departmentCode;
}
