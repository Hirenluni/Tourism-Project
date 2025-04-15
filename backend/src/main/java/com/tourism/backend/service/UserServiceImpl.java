package com.tourism.backend.service;

import com.tourism.backend.entity.User;
import com.tourism.backend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll(); // Get all users from the repository
    }

    @Override
    public Optional<User> getUserById(Long userId) {
        return userRepository.findById(userId); // Find user by ID from the repository
    }

    @Override
    public User saveUser(User user) {
        return userRepository.save(user); // Save user to the repository
    }

    @Override
    public void deleteUser(Long userId) {
        userRepository.deleteById(userId); // Delete user by ID
    }
}
