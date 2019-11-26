package com.hechao.dao;

import com.hechao.entity.User;

import java.util.List;

/**
 * Copyright (C) 2019 思创数码科技股份有限公司
 * <p>
 * 版权所有
 * <p>
 * 接口名　　  : UserDao
 * 功能概要  :
 * 做成日期  : 2019/3/10  hechao
 */
public interface UserDao {
    public User login(User user);
    public List<String> selectRole(String username);
    public List<String> selectPermission(String username);
}
