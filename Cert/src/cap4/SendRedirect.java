package cap4;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * sendRedirect é um método de HttpServletResponse e serve para
 * realizar um redirecionamento
 * @author Leandro
 *
 */
public class SendRedirect extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse resp){
		
		try {
			resp.sendRedirect("respostaRedirect.do");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
