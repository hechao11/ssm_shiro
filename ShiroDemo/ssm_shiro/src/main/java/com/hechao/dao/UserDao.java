package com.hechao.dao;

import com.hechao.entity.User;

import java.util.List;

/**
 * Copyright (C) 2019
 * <p>
 * 版权所有
 * <p>
 * 接口名　　  : UserDao
 * 功能概要  :
 * 做成日期  : 2019/3/10  hechao
 */
public interface UserDao {

    User login(User user);
    List<String> selectRole(String username);
    List<String> selectPermission(String username);
}
