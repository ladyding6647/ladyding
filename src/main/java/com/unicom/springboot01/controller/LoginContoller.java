package com.unicom.springboot01.controller;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

/**
 * 这个类是:${END}
 *
 * @author lyl
 * @version 1.0
 * Date: 2019/5/30 15:06
 */
@Controller
public class LoginContoller {


    @RequestMapping(value = "/user/login",method = RequestMethod.POST)
    public String login(@RequestParam("userName") String userName,
                        @RequestParam("userpwd") String userpwd,
                        Map<String, Object> map){

        if(!StringUtils.isEmpty(userName)&&
                "1234".equals(userpwd)){
            return "index"; // 登录成功
        } else {
            map.put("msg","用户名或密码错误，登录失败！");
            return "login2"; // 登录失败
        }
    }
    
 
     
}
