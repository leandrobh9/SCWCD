package cap4;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RespostaSendRedirect extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
//		identicos
		resp.setContentType("text/html");
//		resp.setHeader("content-type", "text/html");
		
		PrintWriter pw = resp.getWriter();
		pw.println("<html>");
		pw.println("<body>");
		pw.println("encaminhamento feito!");
		pw.println("</body>");
		pw.println("</html>");
	}
}
