package com.koenig.firstjobapp.service;

import java.util.List;

import com.koenig.firstjobapp.job.Job;

public interface JobService {

	List<Job>findAll();
	void createJob(Job job);
	Job getJobById(Long id);
	boolean deleteJobById(Long id);
	boolean updateJob(Long id, Job updatedJob);
}
