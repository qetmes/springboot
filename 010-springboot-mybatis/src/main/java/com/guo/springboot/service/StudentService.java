package com.guo.springboot.service;

import com.guo.springboot.model.Student;

public interface StudentService {

    //根据学生ID查询学生
    Student queryStudentById(Integer id);
}
