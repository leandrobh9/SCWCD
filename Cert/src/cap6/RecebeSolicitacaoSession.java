package cap6;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class RecebeSolicitacaoSession extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

			HttpSession session = req.getSession();
			String nome = (String)session.getAttribute("nome");
			
			resp.setContentType("text/html");
			PrintWriter pw = resp.getWriter();
			pw.println("<html><body>");
			pw.println(nome);
			pw.println("link: <a href='" + resp.encodeURL("session.do") + "'>voltar</a>");
			pw.println("</body></html>");
	}
}
