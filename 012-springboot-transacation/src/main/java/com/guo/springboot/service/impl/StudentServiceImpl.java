package com.guo.springboot.service.impl;

import com.guo.springboot.mapper.StudentMapper;
import com.guo.springboot.model.Student;
import com.guo.springboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Transactional
    @Override
    public int updateStudentById(Student student) {
        int i = studentMapper.updateByPrimaryKeySelective(student);

        int a = 10/0;
        return i;
    }
}
