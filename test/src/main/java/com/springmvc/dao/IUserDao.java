package com.springmvc.dao;

import com.springmvc.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IUserDao {
    public List<User> getAllUser();
}
