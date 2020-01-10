package com.ri.controller;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/batch")
public class BatchController {
	@Autowired
	private JobLauncher luncher;
	@Autowired
	private JobExecution execution;
	@Autowired
	private Job job1;
	
	
	@GetMapping("/invocation")
	public String batchExexutionInvocation() {
		try {
			execution=luncher.run(job1, new JobParameters());
			return "Status::" +execution.getStatus();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null; 
		
	}
	

}
