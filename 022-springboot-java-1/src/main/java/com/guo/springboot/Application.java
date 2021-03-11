package com.guo.springboot;

import com.guo.springboot.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        /**
         * springboot程序启动后，返回值是ConfigurableApplicationContext,它也是一个spring容器
         * 它其实相当于原来spring容器中启动容器ClasspathXmlApplicationContext
         */

        //获取springboot容器
        ConfigurableApplicationContext applicationContext = SpringApplication.run(Application.class, args);

        //从spring容器中获取指定bean对象
        StudentService studentService = (StudentService) applicationContext.getBean("studentServiceImpl");

        //调用业务方法
        String s = studentService.sayHello();
        System.out.println(s);

    }

}
