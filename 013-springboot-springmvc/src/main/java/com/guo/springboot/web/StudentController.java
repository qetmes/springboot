package com.guo.springboot.web;


import com.guo.springboot.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
public class StudentController {

    @RequestMapping(value = "/student")
    public Object student(){
        Student student = new Student();
        student.setId(1001);
        student.setName("zhangsan");
        return student;
    }
}
