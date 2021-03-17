package com.udemy.tasksectionsix.job;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@EnableBatchProcessing
@Configuration
public class JobConfig {

	@Autowired
	private JobBuilderFactory builderFactory;
	
	@Bean
	public Job executeJob(Step executeStep) {
		return builderFactory
				.get("executeJob")
				.start(executeStep)
				.build();
	}
	
}
