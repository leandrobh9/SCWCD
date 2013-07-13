package com.entidades;

public class Pessoa {

	Integer id;
	String nome;
	
	public Pessoa(){}
	
	public Pessoa(Integer id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
