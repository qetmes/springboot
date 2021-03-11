package com.guo.springboot.controller;


import com.guo.springboot.config.Abc;
import com.guo.springboot.config.School;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {

    @Autowired  //引用类型属性自动注入
    private School school;

    @Autowired
    private Abc abc;

    @RequestMapping(value = "/say")
    public @ResponseBody String say(){
        return "school.name="+school.getName()+"...school.websit="+school.getWebsit()+
                "abc.name="+abc.getName()+"abc.websit="+abc.getWebsit();
    }

}
