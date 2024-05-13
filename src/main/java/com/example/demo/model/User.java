package com.example.demo.model;

import java.util.UUID;

public class User {
    private String id;
    private String name;

    public User() {
        this.id = UUID.randomUUID().toString();
    }

    // Getters and setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
