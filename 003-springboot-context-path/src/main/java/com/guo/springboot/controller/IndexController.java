package com.guo.springboot.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class IndexController {

    @RequestMapping(value = "/say")
    @ResponseBody
    public String say(){
        return "say:hello springboot!";
    }

    @RequestMapping(value = "/map")
    public @ResponseBody Map<String,Integer> map(){
        Map<String,Integer> map = new HashMap<>();
        map.put("s",1);
        return map;
    }
}
