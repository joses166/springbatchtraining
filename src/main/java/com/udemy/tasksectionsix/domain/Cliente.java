package com.udemy.tasksectionsix.domain;

public class Cliente {

	private String nome;
	private Integer idade;
	private String email;
	private Double faixa_salarial;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getIdade() {
		return idade;
	}
	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Double getFaixa_salarial() {
		return faixa_salarial;
	}
	public void setFaixa_salarial(Double faixa_salarial) {
		this.faixa_salarial = faixa_salarial;
	}

	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", idade=" + idade + ", email=" + email + ", faixa_salarial=" + faixa_salarial
				+ "]";
	}
	
}
