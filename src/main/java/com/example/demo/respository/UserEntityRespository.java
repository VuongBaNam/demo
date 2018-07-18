package com.example.demo.respository;

import com.example.demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserEntityRespository extends JpaRepository<User, Long> {

}
