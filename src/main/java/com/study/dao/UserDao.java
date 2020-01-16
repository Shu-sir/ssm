package com.study.dao;

import com.study.model.User;

public interface UserDao {
    User selectUser(long id);
}
