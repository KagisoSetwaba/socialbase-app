package com.socialbase.controller;

import com.socialbase.model.User;
import java.util.HashMap;
import java.util.Map;

public class UserController {
    private Map<Integer, User> users = new HashMap<>(); // Simulating a database with a HashMap
    private int userIdCounter = 1; // To generate unique user IDs

    // Register a new user
    public User registerUser (String username, String password, String email) {
        User newUser  = new User(userIdCounter++, username, password, email);
        users.put(newUser.getUserId(), newUser );
        return newUser ;
    }

    // Login a user
    public User loginUser (String username, String password) {
        for (User  user : users.values()) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                return user; // User found and authenticated
            }
        }
        return null; // Authentication failed
    }

    // Update user information
    public boolean updateUser (int userId, String username, String password, String email) {
        User user = users.get(userId);
        if (user != null) {
            user.setUsername(username);
            user.setPassword(password);
            user.setEmail(email);
            return true; // Update successful
        }
        return false; // User not found
    }

    // Get user by ID
    public User getUserById(int userId) {
        return users.get(userId);
    }
}