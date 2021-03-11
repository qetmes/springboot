package com.guo.springboot.mapper;

import com.guo.springboot.model.Student;
import org.apache.ibatis.annotations.Mapper;


@Mapper  //相当于扫描器，扫描DAO接口到spring容器
public interface StudentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Student record);

    int insertSelective(Student record);

    Student selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);
}