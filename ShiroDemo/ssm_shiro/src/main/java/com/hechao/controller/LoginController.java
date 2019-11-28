package com.hechao.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Copyright (C) 2019 修改注释测试git  dev
 * <p>
 * 版权所有
 * <p>
 * 类名　　  : LoginController
 * 功能概要  :
 * 做成日期  : 2019/3/10  hechao
 */
@Controller
public class LoginController {
    @RequestMapping("/login")
    public String login(@RequestParam("username") String username, @RequestParam("password") String password){
        Subject subject = SecurityUtils.getSubject();
        if (!subject.isAuthenticated()){
            UsernamePasswordToken token = new UsernamePasswordToken(username,password);
            try {
                //执行认证操作
                subject.login(token);
            }catch (Exception e){
                return e.getMessage();
            }
        }
        return "success";
    }

    @RequestMapping("/test1")
    @ResponseBody
    public String test1(){
        Subject subject = SecurityUtils.getSubject();
        try {
            subject.checkRole("admin");
        }catch (Exception e){
            return "不拥有admin角色";
        }
        return "拥有admin角色";
    }

    @RequestMapping("/test2")
    @ResponseBody
    public String test2(){
        Subject subject= SecurityUtils.getSubject();
        try {
            subject.checkRole("CEO");
        }catch (Exception e){
            return "不拥有CEO角色";
        }
        return "拥有admin角色";
    }
}
