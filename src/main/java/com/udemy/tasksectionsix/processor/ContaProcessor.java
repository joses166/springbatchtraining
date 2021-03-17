package com.udemy.tasksectionsix.processor;

import org.springframework.batch.item.ItemProcessor;

import com.udemy.tasksectionsix.domain.Cliente;
import com.udemy.tasksectionsix.domain.Conta;
import com.udemy.tasksectionsix.enums.TipoEnum;

public class ContaProcessor implements ItemProcessor<Cliente, Conta> {

	private TipoEnum tipoEnum;
	private Double limite;
	
	public ContaProcessor(TipoEnum tipoEnum, Double limite) {
		this.tipoEnum = tipoEnum;
		this.limite = limite;
	}
	
	@Override
	public Conta process(Cliente item) throws Exception {
		System.out.println(String.format("O cliente %s possui uma conta %s", item.getNome(), tipoEnum.name()));
		return new Conta((int) Math.floor(Math.random() * 100), tipoEnum, limite, item.getEmail());
	}

	public TipoEnum getTipoEnum() {
		return tipoEnum;
	}

	public void setTipoEnum(TipoEnum tipoEnum) {
		this.tipoEnum = tipoEnum;
	}

	public Double getLimite() {
		return limite;
	}

	public void setLimite(Double limite) {
		this.limite = limite;
	}
	
}
