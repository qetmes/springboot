package com.guo.springboot.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.guo.springboot.mapper.StudentMapper;
import com.guo.springboot.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;


@Component
@Service(interfaceName = "com.guo.springboot.service.StudentService", version = "1.0.0",timeout = 15000)
public class StudentServiceImpl implements StudentService {


    @Autowired
    private StudentMapper studentMapper;

    @Autowired
    private RedisTemplate<Object, Object> redisTemplate;

    @Override
    public Student queryStudentById(Integer id) {
        return studentMapper.selectByPrimaryKey(id);
    }

    @Override
    public Integer queryAllStudentCount() {
        //首先去redis缓存中查询，如果有：直接使用，如果没有：去数据库查询并存放到redis缓存中
        //提升系统性能，用户体验提升
        Integer allStudentCount = (Integer) redisTemplate.opsForValue().get("allStudentCount");

        //判断是否有值
        if(allStudentCount==null){
            //去数据库查询
            allStudentCount = studentMapper.selectAllStudentCount();

            //并存放到redis缓存中,30秒之后消失
            redisTemplate.opsForValue().set("allStudentCount", allStudentCount);
        }

        return allStudentCount;
    }
}
