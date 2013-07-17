package cap8;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cap8.model.PessoaFisica;

public class ServletCap8 extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		PessoaFisica pf = new PessoaFisica();
		pf.setId(1);
		pf.setNome("Leandro");
		
		PessoaFisica pf2 = new PessoaFisica();
		pf2.setId(2);
		
		req.setAttribute("pessoa", pf);
		req.setAttribute("pessoa2", pf2);
		
		RequestDispatcher rd = req.getRequestDispatcher("/index.jsp");
		rd.forward(req, resp);
	}
}
