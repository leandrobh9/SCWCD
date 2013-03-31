
package leandro.web;

import javax.servlet.*;
import javax.servlet.http.*;
import leandro.model.Carro;
import java.io.*;

public class Teste extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
		Carro carro = (Carro) getServletContext().getAttribute("carro");
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("Teste dos servlets e do listener");
		out.println("<br /><br />");
		out.println("Valor da cor do carro eh " + carro.getCor());
	}
}
