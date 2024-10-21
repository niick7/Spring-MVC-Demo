package com.example.thymeleaf_demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {
    @GetMapping("/demo")
    public String demo(Model theModel) {
        theModel.addAttribute("theDate", java.time.LocalDateTime.now());

        return "demo";
    }
}
