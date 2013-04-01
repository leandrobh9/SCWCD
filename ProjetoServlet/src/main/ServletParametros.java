package main;

import java.io.PrintWriter;
import java.util.Iterator;

import javax.servlet.http.HttpServlet;

public class ServletParametros extends HttpServlet {

	protected void doGet(javax.servlet.http.HttpServletRequest req, javax.servlet.http.HttpServletResponse resp) throws javax.servlet.ServletException ,java.io.IOException {
		
		String nome = getServletConfig().getInitParameter("nome");
		String cor = getServletContext().getInitParameter("cor");
				
		PrintWriter pw = resp.getWriter();
		pw.println("Init param de servlet: " + nome);
		pw.println("Init param de contexto: " + cor);
		
		resp.setContentType("text/html");
	}
}
