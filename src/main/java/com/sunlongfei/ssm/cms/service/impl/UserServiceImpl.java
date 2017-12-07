package com.sunlongfei.ssm.cms.service.impl;

import com.sunlongfei.ssm.cms.dao.UserDao;
import com.sunlongfei.ssm.cms.model.User;
import com.sunlongfei.ssm.cms.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userService")
public class UserServiceImpl  implements UserService{

    @Resource
    private UserDao userDao;

    public User getUserById(long userId){
        return this.userDao.getUserById(userId);
    };
}
