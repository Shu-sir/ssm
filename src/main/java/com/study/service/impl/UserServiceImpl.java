package com.study.service.impl;

import com.study.dao.UserDao;
import com.study.model.User;
import com.study.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @autor Administrator
 * @date 2020/1/16 11:10
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;
    @Override
    public User selectUser(long userId) {
        return userDao.selectUser(userId);
    }
}
