package com.example.sql.Service.impl;

import com.example.sql.Entitydata.User;
import com.example.sql.Repository.UserRepo;
import com.example.sql.Service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepo repo;

    @Autowired
    private BCryptPasswordEncoder encoder;

    @Override
    public User register(User user) {

        // Role logic
        if (user.getRole() == null) {
            user.setRole("USER");
        }

        // Password encrypt
        user.setPassword(encoder.encode(user.getPassword()));

        return repo.save(user);
    }

    @Override
    public List<User> getAll() {
        return repo.findAll();
    }
}
