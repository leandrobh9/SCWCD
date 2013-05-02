package cap5.listener;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class TestListenerContext extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		PrintWriter out = resp.getWriter();
		
		Object c = getServletContext().getAttribute("cachorro");
		if (c instanceof Cachorro){
			String nome = ((Cachorro) c).getNome();
			out.println("Nome do cachorro carregado no listener: " + nome);
		}
		
		HttpSession s = req.getSession();
		s.setAttribute("cachorroo", c);
	}
}
