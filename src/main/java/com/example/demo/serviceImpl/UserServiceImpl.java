package com.example.demo.serviceImpl;

import com.example.demo.entity.User;
import com.example.demo.respository.UserEntityRespository;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserEntityRespository userEntityRespository;
    @Override
    public List<User> getListUser() {
        return userEntityRespository.findAll();
    }

    @Override
    public void update(User user) {
        userEntityRespository.save(user);
    }

    @Override
    public void insert(User user) {
        userEntityRespository.save(user);
    }

    @Override
    public void delete(Long id) {
        userEntityRespository.deleteById(id);
    }
}
