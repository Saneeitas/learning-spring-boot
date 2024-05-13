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

    public User updateUser(String id, User updatedUser) {
        for (int i = 0; i < users.size(); i++) {
            User user = users.get(i);
            if (user.getId().equals(id)) {
                updatedUser.setId(id); // Ensure the ID remains the same
                users.set(i, updatedUser);
                return updatedUser;
            }
        }
        return null; // User not found
    }

    public boolean deleteUser(String id) {
        return users.removeIf(user -> user.getId().equals(id));
    }

    
}
