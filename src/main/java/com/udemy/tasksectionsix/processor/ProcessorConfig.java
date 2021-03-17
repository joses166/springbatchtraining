package com.udemy.tasksectionsix.processor;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.batch.item.support.builder.ClassifierCompositeItemProcessorBuilder;
import org.springframework.classify.Classifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.udemy.tasksectionsix.domain.Cliente;
import com.udemy.tasksectionsix.enums.TipoEnum;

@Configuration
public class ProcessorConfig {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Bean
	public ItemProcessor executePrCliente() {
		return new ClassifierCompositeItemProcessorBuilder()
				.classifier(classifier())
				.build();
	}

	@SuppressWarnings({ "rawtypes", "serial" })
	private Classifier classifier() {
		return new Classifier<Cliente, ItemProcessor>() {
			@Override
			public ItemProcessor classify(Cliente cliente) {
				if (cliente.getFaixa_salarial() <= 3000) 
					return new ContaProcessor(TipoEnum.PRATA, 500.00);
				else if (cliente.getFaixa_salarial() <= 5000)
					return new ContaProcessor(TipoEnum.OURO, 1000.00);
				else if (cliente.getFaixa_salarial() <= 10000)
					return new ContaProcessor(TipoEnum.PLATINA, 2500.00);
				else
					return new ContaProcessor(TipoEnum.DIAMANTE, 5000.00);
			}
		};
	}
	
}
