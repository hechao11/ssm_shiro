package com.hechao.entity;

/**
 * Copyright (C) 2019 思创数码科技股份有限公司
 * <p>
 * 版权所有
 * <p>
 * 类名　　  : User
 * 功能概要  :
 * 做成日期  : 2019/3/10  hechao
 */
public class User {
    private int id;
    private String username;
    private String password;
    private String salt;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }
}
