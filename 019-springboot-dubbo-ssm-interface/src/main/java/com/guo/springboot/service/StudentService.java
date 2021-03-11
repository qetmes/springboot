package com.guo.springboot.service;

import com.guo.springboot.model.Student;

public interface StudentService {

    /**
     * 根据学生id，查询详情
     * @param id
     * @return
     */
    Student queryStudentById(Integer id);


    /**
     * 获取学生总人数
     * @return
     */
    Integer queryAllStudentCount();
}
