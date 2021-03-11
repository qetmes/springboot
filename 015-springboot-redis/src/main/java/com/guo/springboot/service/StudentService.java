package com.guo.springboot.service;

public interface StudentService {

    //将值存放到redis
    void put(String key, String value);

    //从redis获取指定key的值
    String get(String count);
}

