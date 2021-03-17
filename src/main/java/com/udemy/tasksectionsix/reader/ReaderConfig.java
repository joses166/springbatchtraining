package com.udemy.tasksectionsix.reader;

import javax.sql.DataSource;

import org.springframework.batch.item.database.JdbcCursorItemReader;
import org.springframework.batch.item.database.builder.JdbcCursorItemReaderBuilder;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.BeanPropertyRowMapper;

import com.udemy.tasksectionsix.domain.Cliente;

@Configuration
public class ReaderConfig {
	@Bean
	public JdbcCursorItemReader<Cliente> executeReader(
			@Qualifier("appDataSource") DataSource dataSource
			){
		return new JdbcCursorItemReaderBuilder<Cliente>()
				.name("executeReader")
				.dataSource(dataSource)
				.sql("SELECT * FROM cliente")
				.rowMapper(new BeanPropertyRowMapper<Cliente>(Cliente.class))
				.build();
	}
	
}
