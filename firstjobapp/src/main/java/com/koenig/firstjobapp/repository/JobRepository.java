package com.koenig.firstjobapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.koenig.firstjobapp.job.Job;

public interface JobRepository extends JpaRepository<Job, Long> {

}
