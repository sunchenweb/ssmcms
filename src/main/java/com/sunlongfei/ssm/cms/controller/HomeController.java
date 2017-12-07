package com.sunlongfei.ssm.cms.controller;

import com.sunlongfei.ssm.cms.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
@RequestMapping("/")
public class HomeController {
    @Resource
    private UserService userService;

    @RequestMapping("/index")
    public String mainPage(){
        return "home/index";
    }
}
