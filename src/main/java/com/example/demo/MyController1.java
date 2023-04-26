package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController1 {

    @GetMapping("test1")
    public String test(Model model) {
        model.addAttribute("test", "Here we are");
        return "x";
    }
}
