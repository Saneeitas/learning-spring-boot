package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/")
    public String home(){
        return "Home Page";
    }

    @GetMapping("/hello")
    public String hello() {
        return "Hello World!";
    }

    @GetMapping("/greeting")
    public String greeting(@RequestParam(value = "user", defaultValue = "World") String user) {
        return "Hello, " + user + "!";
    }
    
}
