package main;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Principal extends HttpServlet {

	private int i = 0;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.println("Teste de conteudo");
		out.println("i =  " + i++);
		out.flush();
	}
	
	@Override
	public void init() throws ServletException {
		System.out.println("Teste do metodo init...");
	}
	
}
