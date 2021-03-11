package com.guo.springboot.controller;

import com.guo.springboot.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping(value = "/user")
public class UserController {

    //用户登录的请求
    @RequestMapping(value = "/login")
    public @ResponseBody Object login(HttpServletRequest request){
        //将用户信息存放到session中
        User user = new User();
        user.setId(1001);
        user.setName("李四");
        request.getSession().setAttribute("user",user);
        return "login SUCCESS";
    }

    //该请求需要用户登录之后才可访问
    @RequestMapping(value = "/center")
    public @ResponseBody Object center(){
        return "see center message";
    }

    //该请求不需要登录也可访问
    @RequestMapping(value = "/out")
    public @ResponseBody Object out(){
        return "out see  message";
    }

    //如果用户未登录访问了需要登录才能访问的请求，之后会跳转到该请求路径
    //该请求不需要登录也可访问
    @RequestMapping(value = "/error")
    public @ResponseBody Object error(){
        return "error";
    }

}
