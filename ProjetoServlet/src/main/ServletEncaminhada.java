package main;

import javax.servlet.http.HttpServlet;

public class ServletEncaminhada extends HttpServlet {

	protected void doGet(javax.servlet.http.HttpServletRequest req, javax.servlet.http.HttpServletResponse resp) throws javax.servlet.ServletException ,java.io.IOException {
		
		String cor = (String) getServletContext().getAttribute("cor");
		resp.getWriter().println(cor);
		resp.getWriter().flush();
	}
}
