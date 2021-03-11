package com.guo.springboot.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {

    @RequestMapping(value = "/say")
    public ModelAndView say(){
        ModelAndView mv = new ModelAndView();
        mv.addObject("message","hello,springboot");
        mv.setViewName("say");
        return mv;
    }

    //还可以将ModelAndView拆分开
    @RequestMapping(value = "/index")
    public String index(Model model){
        model.addAttribute("message","helloworld");
        return "say";
    }


}
