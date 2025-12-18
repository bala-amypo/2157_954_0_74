package com.example.sql.Controller;

import com.example.sql.Entitydata.User;
import com.example.sql.Service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService service;

    @PostMapping("/users")
    public User create(@RequestBody User user) {
        return service.register(user);
    }

    @GetMapping("/users")
    public List<User> getAll() {
        return service.getAll();
    }
}
