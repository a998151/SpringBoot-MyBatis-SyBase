package com.example.springbootcloud.controller;

import com.example.springbootcloud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    UserService userServiceImpl;

    @RequestMapping("hello")
    public String hello(){
        return userServiceImpl.getUserNo("3333");
    }


}
