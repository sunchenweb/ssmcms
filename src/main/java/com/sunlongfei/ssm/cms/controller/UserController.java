package com.sunlongfei.ssm.cms.controller;

import com.sunlongfei.ssm.cms.model.User;
import com.sunlongfei.ssm.cms.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService;
    @RequestMapping("/get")
    @ResponseBody
    public User getUserByID(HttpServletRequest request){
        return this.userService.getUserById(Integer.parseInt(request.getParameter("id")));
    }
}
