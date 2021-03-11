package com.guo.springboot.web;


import com.guo.springboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@Controller
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping(value = "/put")
    @ResponseBody
    public Object put(String key, String value){
        studentService.put(key,value);
        return "值已成功放入redis";
    }

    @RequestMapping(value = "/get")
    @ResponseBody
    public Object get(){
        String value =  studentService.get("count");
        return value;
    }


}
