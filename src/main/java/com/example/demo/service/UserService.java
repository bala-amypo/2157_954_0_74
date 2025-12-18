package com.example.sql.Service;

import com.example.sql.Entitydata.User;
import java.util.List;

public interface UserService {
    User register(User user);
    List<User> getAll();
}
