package com.guo.springboot.service.impl;

import com.guo.springboot.service.StudentService;
import org.springframework.stereotype.Service;


@Service
public class StudentServiceImpl implements StudentService {
    @Override
    public String sayHello() {
        return "sayhello";
    }
}
