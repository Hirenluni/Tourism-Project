package com.tourism.backend.service;

import com.tourism.backend.entity.User;
import com.tourism.backend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    // Fetch all users
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    // Check if user exists by email
    public boolean isUserExist(String email) {
        return userRepository.findByEmail(email).isPresent();
    }

    // Save user with encrypted password
    public User saveUser(User user) {
        if (isUserExist(user.getEmail())) {
            throw new RuntimeException("User already exists with this email.");
        }
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return userRepository.save(user);
    }

    // Fetch user by ID
    public User getUserById(Integer id) {
        return userRepository.findById(id).orElse(null);
    }

    // Delete user by ID
    public void deleteUser(Integer id) {
        userRepository.deleteById(id);
    }
}
