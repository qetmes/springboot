package com.guo.springboot.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {

    //使用@Value可以调用核心配置文件中自定义的配置。
    @Value("${school.name}")
    public String schoolName;

    @Value("${websit}")
    public String web;

    @RequestMapping(value = "/say")
    public @ResponseBody String say(){
        return "say: hello springboot+"+ schoolName + web;
    }

}
