package com.example.demo;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;
import com.example.demo.service.UserService;

@RestController
public class DemoController {

    private UserService userService;

    public DemoController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/")
    public String home() {
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

    @GetMapping("/users") // Get all users
    public List<User> getUsers() {
        return userService.getUsers();
    }

    @PostMapping("/users") // Create a user
    public User createUser(@RequestBody User user) {
        return userService.createUser(user);
    }

}
