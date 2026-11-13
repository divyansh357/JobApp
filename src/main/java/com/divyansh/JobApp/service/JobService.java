package com.divyansh.JobApp.service;

import com.divyansh.JobApp.model.JobPost;
import com.divyansh.JobApp.repo.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {

    @Autowired
    JobRepo repo;

    public void addJob(JobPost jobPost){
        repo.addJob(jobPost);
    }

    public List<JobPost> allJobs(){
        return repo.getJobs();
    }

}
