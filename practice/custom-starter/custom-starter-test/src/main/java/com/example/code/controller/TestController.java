package com.example.code.controller;

import com.example.code.custom.UserTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/test")
@Controller
public class TestController {

    @Autowired
    private UserTemplate userTemplate;

    @RequestMapping("/user")
    @ResponseBody
    public String test(){
        System.out.println(userTemplate.getUserInfoProperties());
        return "user";
    }
}
