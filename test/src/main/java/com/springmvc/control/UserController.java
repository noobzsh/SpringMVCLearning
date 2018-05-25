package com.springmvc.control;

import com.springmvc.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

public class UserController {
    @Autowired
    public IUserService userService;
    @RequestMapping("info")
    @ResponseBody
    public List userInfor(){
        System.out.println("----------------------------------------------");
        System.out.println( userService.getUser().size());
        return userService.getUser();
    }
}
