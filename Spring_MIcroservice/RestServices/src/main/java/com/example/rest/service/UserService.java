package com.example.rest.service;

import java.util.List;

import com.example.rest.dto.Userdto;
import com.example.rest.entity.User;

public interface UserService {
    Userdto createUser(Userdto user);

    User getUserById(Long userId);

    List<User> getAllUsers();

    User updateUser(User user);

    void deleteUser(Long userId);
}
