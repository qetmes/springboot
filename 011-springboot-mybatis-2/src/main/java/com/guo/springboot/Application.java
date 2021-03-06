package com.guo.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

@MapperScan(basePackages = "com.guo.springboot.mapper")  //开启扫描Mapper接口的包以及子目录。
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
