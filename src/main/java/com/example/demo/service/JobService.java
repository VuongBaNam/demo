package com.example.demo.service;

import com.example.demo.entity.Job;

import java.util.List;

public interface JobService {
    List<Job> getListJob();

    void update(Job job);

    void insert(Job job);

    void delete(Long id);
}
