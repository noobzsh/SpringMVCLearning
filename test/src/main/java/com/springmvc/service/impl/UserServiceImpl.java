package com.springmvc.service.impl;

import com.springmvc.dao.IUserDao;
import com.springmvc.entity.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("userService")
public class UserServiceImpl {
    @Resource
    private IUserDao userDao;
    public List<User> getUser() {
        return userDao.getAllUser();
    }
}
