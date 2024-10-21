package com.example.thymeleaf_demo.controller;

import com.example.thymeleaf_demo.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class StudentController {
    @GetMapping("/student/registration")
    public String registration(Model model) {
        model.addAttribute("student", new Student());

        return "students/registration";
    }

    @PostMapping("/student/confirmation")
    public String confirmation(@ModelAttribute("student") Student student) {
        return "students/confirmation";
    }
}
