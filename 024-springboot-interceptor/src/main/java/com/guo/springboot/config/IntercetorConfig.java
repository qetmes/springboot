package com.guo.springboot.config;

import com.guo.springboot.interceptor.UserInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@Configuration  //定义此类为配置文件（即相当于之前的xml配置文件）
public class IntercetorConfig implements WebMvcConfigurer {

    //mvc:interceptors
    @Override
    public void addInterceptors(InterceptorRegistry registry) {

        //要拦截user下的所有访问请求，必须用户登录之后才可以访问，
        //但是这样拦截的路径中有一些是不需要用户登录也可以访问的
        String [] addPathPatterns = {
                "/user/**"
        };
        //要排除的路径，排除的路径说明不需要用户登录也可访问
        String [] excludePathPatterns = {
                "/user/out","/user/error","/user/login"
        };

        //mvc:interceptor bean class=""
        registry.addInterceptor(new UserInterceptor())
                .addPathPatterns(addPathPatterns)
                .excludePathPatterns(excludePathPatterns);

    }
}
