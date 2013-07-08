package cap8.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cap8.model.Pessoa;

public class ServletCap8 extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		Pessoa p = new Pessoa();
		p.setNome("Leandro");
		req.setAttribute("minhapessoa", p);
		
		RequestDispatcher rd = req.getRequestDispatcher("/cap8/useBean.jsp");
		rd.forward(req, resp);
	}

}
