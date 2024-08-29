package app.main.springdatabasedemo.service;

import app.main.springdatabasedemo.dto.request.JobCreationRequest;
import app.main.springdatabasedemo.entity.Job;
import app.main.springdatabasedemo.repository.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JobService {
    @Autowired
    private JobRepository jobRepository;

    public Job createJob(JobCreationRequest request){
        Job job = new Job();

        job.setId(request.getId());
        job.setJobName(request.getJobName());
        job.setDescription(request.getDescription());
        job.setAvailability(request.getAvailability());

        return jobRepository.save(job);
    }
}
