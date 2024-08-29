package app.main.springdatabasedemo.controller;

import app.main.springdatabasedemo.dto.request.JobCreationRequest;
import app.main.springdatabasedemo.entity.Job;
import app.main.springdatabasedemo.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JobController {
    @Autowired
    public JobService jobService;

    @PostMapping("/job")
    Job createJob(@RequestBody JobCreationRequest request) {
        return jobService.createJob(request);
    }
}
