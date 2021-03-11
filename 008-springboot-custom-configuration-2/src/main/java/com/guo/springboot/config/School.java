package com.guo.springboot.config;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component  //将此类交给spring容器进行管理
@ConfigurationProperties(prefix = "school")   //核心配置类，prefix指明前缀。
public class School {
    private String name;
    private String websit;

    public School() {
    }

    public School(String name, String websit) {
        this.name = name;
        this.websit = websit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWebsit() {
        return websit;
    }

    public void setWebsit(String websit) {
        this.websit = websit;
    }
}
