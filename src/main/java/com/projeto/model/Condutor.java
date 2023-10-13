package com.projeto.model;

public class Condutor {
	private String name;
	private String cpf;
	
	
	public Condutor(String name, String cpf) {
		this.name = name;
		this.cpf = cpf;
	}
	public String getCPF() {
		return cpf;
	}
	
	public void setCPF(String cpf) {
		
		this.cpf = cpf;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
}
