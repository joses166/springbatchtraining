package com.udemy.tasksectionsix.writer;

import org.springframework.batch.item.ItemWriter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WriterConfig {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Bean
	public ItemWriter processadorClassifierWriter() {
		return items -> items.forEach(System.out::println);
	}

}
