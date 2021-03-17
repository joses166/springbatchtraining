package com.udemy.tasksectionsix.domain;

import com.udemy.tasksectionsix.enums.TipoEnum;

public class Conta {

	private Integer id;
	private TipoEnum tipo;
	private Double limite;
	private String cliente_id;
	
	public Conta(Integer id, TipoEnum tipo, Double limite, String cliente_id) {
		super();
		this.id = id;
		this.tipo = tipo;
		this.limite = limite;
		this.cliente_id = cliente_id;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public TipoEnum getTipo() {
		return tipo;
	}
	public void setTipo(TipoEnum tipo) {
		this.tipo = tipo;
	}
	public Double getLimite() {
		return limite;
	}
	public void setLimite(Double limite) {
		this.limite = limite;
	}
	public String getCliente_id() {
		return cliente_id;
	}
	public void setCliente_id(String cliente_id) {
		this.cliente_id = cliente_id;
	}

	@Override
	public String toString() {
		return "Conta [id=" + id + ", tipo=" + tipo + ", limite=" + limite + ", cliente_id=" + cliente_id + "]";
	}
	
}
