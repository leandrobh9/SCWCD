package cap4;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 
 * Ciclo de vida (construtor, metodo init(), destroy())
 * 
 * @author Leandro
 *
 */
public class Servlet extends HttpServlet {

	public Servlet() {
		System.out.println("construtor");
	}
	
	@Override
	public void init() throws ServletException {
		System.out.println("metodo init");
	}
	
	@Override
	public void destroy() {
		System.out.println("destroy");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		String id = req.getParameter("id");
		PrintWriter pw = resp.getWriter();
		pw.println(id);
	}
}

