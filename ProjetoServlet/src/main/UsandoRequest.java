package main;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UsandoRequest extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
			
		//this.requestDispatcher(req, resp);
		this.encaminhar(req, resp);
	}
	
	public void requestDispatcher(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		// setando atributo para requisicao
		req.setAttribute("nome", "Leandro");

		// obtendo uma excecao
		PrintWriter out = resp.getWriter();
		out.println("obtendo exception");
		out.flush();
		
		RequestDispatcher r = req.getRequestDispatcher("teste.jsp");
		r.forward(req, resp);
	}
	
	public void encaminhar(HttpServletRequest req, HttpServletResponse resp) throws IOException{

		getServletContext().setAttribute("cor", new String("preto"));
		resp.sendRedirect("outraurl.do");
	}
}
