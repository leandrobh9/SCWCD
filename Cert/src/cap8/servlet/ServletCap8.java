package cap8.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cap8.model.Pessoa;
import cap8.model.PessoaFisica;

public class ServletCap8 extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		//testeJspUseBean(req, resp);
		//testeObjsImplicitos(req, resp);
		testeTagLib(req, resp);

	}
	
	private void testeTagLib(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		RequestDispatcher rd = getServletContext().getRequestDispatcher("/cap8/taglib.jsp");
		rd.forward(req, resp);
	}

	private void testeJspUseBean(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		//		 testes de <jsp:useBean
		PessoaFisica pf = new PessoaFisica();
		pf.setId(1);
		pf.setNome("Leandro");
		
		PessoaFisica pf2 = new PessoaFisica();
		pf2.setId(2);
		
		req.setAttribute("pessoa", pf);
		req.setAttribute("pessoa2", pf2);
		
		RequestDispatcher rd = req.getRequestDispatcher("/index.jsp");
		rd.forward(req, resp);	}

	private void testeObjsImplicitos(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		// (1) cookie
		Cookie c = new Cookie("nome", "Leandro");
		resp.addCookie(c);

		// (2) atributo de requisicao
		req.setAttribute("sobrenome", "Souza");

		RequestDispatcher rd = req.getRequestDispatcher("/cap8/elobjsimplicitos.jsp");
		rd.forward(req, resp);
	}

}
