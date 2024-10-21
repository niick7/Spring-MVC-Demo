package com.example.thymeleaf_demo.controller;

import com.example.thymeleaf_demo.model.Student;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class StudentController {
    // Inject the countries that we defined in the application.properties
    // To this Student Controller
    @Value("${countries}")
    private List<String> countries;

    @GetMapping("/student/registration")
    public String registration(Model model) {
        model.addAttribute("student", new Student());

        // Add the list of countries to the model
        model.addAttribute("countries", countries);

        return "students/registration";
    }

    @PostMapping("/student/confirmation")
    public String confirmation(@ModelAttribute("student") Student student) {
        return "students/confirmation";
    }
}
