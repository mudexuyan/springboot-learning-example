package edu.hfut.wangyu.domain;

import edu.hfut.wangyu.dal.Project;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 管理员维护
 */

@Component
public interface ProjectMapper  {

    void insertProject(@Param("project")Project project);

    void updateProject(@Param("project")Project project);

    List<Project> selectList();

    void deleteProject(@Param("project")Project project);
}
