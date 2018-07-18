package com.example.demo.respository;

import com.example.demo.entity.Job;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobEntityRespository extends JpaRepository<Job,Long> {
}
