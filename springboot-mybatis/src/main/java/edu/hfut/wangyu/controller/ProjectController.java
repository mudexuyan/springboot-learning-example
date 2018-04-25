package edu.hfut.wangyu.controller;

import edu.hfut.wangyu.dal.Project;
import edu.hfut.wangyu.dal.Result;
import edu.hfut.wangyu.service.ProjectService;
import org.assertj.core.util.Preconditions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ProjectController {

    @Autowired
    private ProjectService projectService;

    @PostMapping(value = "/setting/project/projectList")
    public Result selectList(){
        try {
            return Result.createSuccess("操作成功",projectService.selectList());
        }catch (Exception e){
            return Result.createFailed("操作失败");
        }
    }

    @PostMapping("/setting/project/insertProject")
    public Result insertProject(Project project){
        Preconditions.checkNotNull(project,"project is null");
        try {
            projectService.insertProject(project);
            return Result.createSuccess("操作成功");
        }catch (Exception e){
            return Result.createFailed("操作失败");
        }
    }

    @PostMapping("/setting/project/updateProject")
    public Result updateProject(Project project){
        Preconditions.checkNotNull(project,"project is null");
        try {
            projectService.updateProject(project);
            return Result.createSuccess("操作成功");
        }catch (Exception e){
            return Result.createFailed("操作失败");
        }
    }
    @PostMapping("/setting/project/deleteProject")
    public Result deleteProject(Project project){
        Preconditions.checkNotNull(project,"project is null");
        try {
            projectService.deleteProject(project);
            return Result.createSuccess("操作成功");
        }catch (Exception e){
            return Result.createFailed("操作失败");
        }
    }
}
