package com.example.thymeleaf_demo.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class HelloWorldController {
    @GetMapping("/showForm")
    public String showForm() {
        return "hello-world-form";
    }

    @GetMapping("/processForm")
    public String processForm() {
        return "hello-world";
    }

    @PostMapping("/processFormVersionTwo")
    public String processFormVersionTwo(HttpServletRequest request, Model model) {
        // Read the request parameter from the HTML form
        String theName = request.getParameter("studentName");

        // Convert the data to all caps
        theName = theName.toUpperCase();

        // Create the message
        String result = "Yo! " + theName;

        // Add message to the model
        model.addAttribute("message", result);

        return "hello-world-version-two";
    }

    @PostMapping("/processFormVersionThree")
    public String processFormVersionThree(@RequestParam("studentName") String theName, Model model) {
        // Create the message
        String result = "Hey my friend from V3! " + theName;

        // Add message to the model
        model.addAttribute("message", result);

        return "hello-world-version-three";
    }
}
