package edu.hfut.wangyu.controller;

import edu.hfut.wangyu.dal.User;
import edu.hfut.wangyu.service.UserService;
import org.assertj.core.util.Preconditions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class LoginController {

    @Autowired
    private UserService userService;

    @RequestMapping("/login/student")
    public Map loginStudent(User user, Integer role, String year, String project, String number){

        Preconditions.checkNotNull(user,"user is null");
        Preconditions.checkNotNull(year,"year is null");
        Preconditions.checkNotNull(project,"project is null");
        Preconditions.checkNotNull(number,"number is null");

        Map temp = new HashMap();
        try {
            user.setRole(1111);
            userService.insertAdder(user);
            temp.put("code","success");
        }catch (Exception e){
            temp.put("msg","fail");
        }
        return temp;
    }
    @RequestMapping("/login/teacher")
    public void loginTeacher(){

    }
    @RequestMapping("/login/system")
    public void loginSystem(){

    }
}
