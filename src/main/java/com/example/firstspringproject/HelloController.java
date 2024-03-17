package com.example.firstspringproject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String getHello() {
        return "<b>hello world</b>";
    }

    @GetMapping("/")
    public String getHome() {
        return "Welcome home...";
    }

    @GetMapping("/test")
    public String getTest() {
        return "Sanket ... Singh";
    }
}
