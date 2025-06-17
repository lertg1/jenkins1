package com.example.HelloJenkinsDemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    
    @GetMapping("/hello")
    public String helloJenkins() {
        return "Hello Jenkins";
    }
}
