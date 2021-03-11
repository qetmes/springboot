package com.guo.springboot.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.guo.springboot.service.StudentService;
import org.springframework.stereotype.Component;


@Component
@Service(interfaceClass = StudentService.class, version = "1.0.0", timeout = 15000)
//dubbo:service interface="" version="" timeout=""
public class StudentServiceImpl implements StudentService {
    @Override
    public Integer queryAllStudentCount() {

        //调用数据持久层

        return 1250;
    }
}
