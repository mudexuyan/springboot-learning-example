package edu.hfut.wangyu.service;

import edu.hfut.wangyu.dal.Project;

import java.util.List;

public interface ProjectService {

    void insertProject(Project project);

    void updateProject(Project project);

    List<Project> selectList();

    void deleteProject(Project project);
}
