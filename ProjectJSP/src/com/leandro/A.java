package com.leandro;

public class A {
	
	static int NUMERO = 1;
	
	String nome ; 
	
	public A(){
		nome = "Leandro1";
	}
	
	public void teste(){
		System.out.println("teste A ... ");
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public static int getNUMERO() {
		return ++NUMERO;
	}

}
