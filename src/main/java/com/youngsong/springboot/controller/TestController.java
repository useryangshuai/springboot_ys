package com.youngsong.springboot.controller;

import com.youngsong.springboot.utils.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
    @Autowired
    private RedisUtil redisUtil;
    @RequestMapping("/hello")
    @ResponseBody
    public String hello() {
        redisUtil.set("name","李四");
        String name = (String) redisUtil.get("name");
        return name;
    }

}
