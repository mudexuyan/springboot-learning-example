package edu.hfut.wangyu.controller;

import edu.hfut.wangyu.dal.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegisterController {

    @RequestMapping("/register/student")
    public void registerStudent(User user){


    }

    @RequestMapping("/register/teacher")
    public void registerTeacher(){

    }
}
