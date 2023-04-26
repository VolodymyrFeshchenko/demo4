package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController2 {

    @GetMapping("test2")
    public ModelAndView test(ModelAndView modelAndView) {
        modelAndView.addObject("test", "here we are");
        modelAndView.setViewName("x");
        return modelAndView;
    }
}
