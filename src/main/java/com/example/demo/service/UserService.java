package com.example.demo.service;

import com.example.demo.entity.User;

import java.util.List;

public interface UserService {
    List<User> getListUser();

    void update(User user);

    void insert(User user);

    void delete(Long id);
}
