package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.respository.UserEntityRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DemoController {
    @Autowired
    private UserEntityRespository userRepository;

    @RequestMapping("/user")
    public List<User> getUser(){
        return userRepository.findAll();
    }
}
