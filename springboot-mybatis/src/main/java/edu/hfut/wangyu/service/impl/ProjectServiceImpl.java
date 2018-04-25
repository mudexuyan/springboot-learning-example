package edu.hfut.wangyu.service.impl;

import edu.hfut.wangyu.dal.Project;
import edu.hfut.wangyu.domain.ProjectMapper;
import edu.hfut.wangyu.service.ProjectService;
import org.assertj.core.util.Preconditions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class ProjectServiceImpl implements ProjectService {

    @Autowired
    public ProjectMapper projectMapper;

    @Override
    public void insertProject(Project project) {
        Preconditions.checkNotNull(project,"project is null");
        project.setCreated(new Date());
        projectMapper.insertProject(project);
    }

    @Override
    public void updateProject(Project project) {
        Preconditions.checkNotNull(project,"project is null");
        projectMapper.updateProject(project);
    }

    @Override
    public List<Project> selectList() {
        return projectMapper.selectList();
    }

    @Override
    public void deleteProject(Project project) {
        Preconditions.checkNotNull(project,"project is null");
        projectMapper.deleteProject(project);
    }
}
