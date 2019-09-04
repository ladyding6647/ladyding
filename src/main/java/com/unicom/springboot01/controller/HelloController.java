package com.unicom.springboot01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * 这个类是:${END}
 *
 * @author lyl
 * @version 1.0
 * Date: 2019/5/30 12:02
 */
@Controller
public class HelloController {

    @RequestMapping("/index")
    public String index(Map<String,Object> map){
        map.put("hello","欢迎你！");
//        Map dataMap = new HashMap<>();
//        Map tiltleMap = new HashMap<>();
       for (int i = 0; i < 5; i++) {
    	   map.put("data"+i, "测试数据"+i);
       }
    	 map.put("tiltle", "测试标题");
    	 System.out.println("我进来了");
    	 System.out.println(new Date());
//        return "pie-simple";
        return "login2";
    }




}
