package com.guo.springboot;

import com.guo.springboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {

    @Autowired
    private StudentService studentService;

    public static void main(String[] args) {
        //springboot启动程序，会初始化spring容器
        SpringApplication.run(Application.class, args);
    }

    //重写run方法
    @Override
    public void run(String... args) throws Exception {
        //调用业务方法
        String sayHello = studentService.sayHello("World");
        System.out.println(sayHello);
    }
}
