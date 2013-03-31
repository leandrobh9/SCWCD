package com.escolar.web;

import javax.servlet.*;
import javax.servlet.http.*;

public class Escola extends HttpServlet{

	private int id;

	/**
	* Construtor é executado antes da classe se tornar efetivamente um servlet
	*/
	public Escola(){
		System.out.println("... construtor ...");
		System.out.println("Neste momento, a thread ainda nao existe, apenas uma classe comum...");
	}
	
	/**
	* init() somente roda uma vez. 
	*
	*/
	public void init(){
		System.out.println("Roda o init... Roda apenas quando esta classe torna-se um servlet realmente.");
		System.out.println("Ou seja quando o Container transforma esta classe em um servlet.");
	}
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("servlet rodando... metodo get...");
	}
}