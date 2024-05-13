package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.example.demo.model.User; 

@Service
public class UserService {

    private List<User> users;

    public UserService() {
        this.users = new ArrayList<>();
    }

    public User createUser(User user) {
        // Add logic for ID generation, validation, etc.
         user.setId(UUID.randomUUID().toString());
        users.add(user);
        return user;
    }

    public List<User> getUsers() {
        return users;
      
    }

    
}
