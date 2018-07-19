package com.example.demo.serviceImpl;

import com.example.demo.entity.Job;
import com.example.demo.respository.JobEntityRespository;
import com.example.demo.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobServiceImpl implements JobService {
    @Autowired
    JobEntityRespository jobEntityRespository;
    @Override
    public List<Job> getListJob() {
        return jobEntityRespository.findAll();
    }

    @Override
    public void update(Job job) {
        jobEntityRespository.save(job);
    }

    @Override
    public void insert(Job job) {
        jobEntityRespository.save(job);
    }

    @Override
    public void delete(Long id) {
        jobEntityRespository.deleteById(id);
    }
}
