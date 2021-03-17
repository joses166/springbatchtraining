package com.udemy.tasksectionsix.step;

import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StepConfig {

	@Autowired
	private StepBuilderFactory builderFactory;
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Bean
	public Step executeStep(
			ItemReader itemReader,
			ItemProcessor itemProcessor,
			ItemWriter itemWriter
			) {
		return builderFactory
				.get("executeStep")
				.chunk(1)
				.reader(itemReader)
				.processor(itemProcessor)
				.writer(itemWriter)
				.build();
	}
	
}
