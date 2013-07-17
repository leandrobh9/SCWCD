package cap6;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class TesteSession extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		//testeEncodingUrl(req, resp);
		testeEncodingRedirectUrl(req, resp);
	}
	
	void testeSessionInexistente(HttpServletRequest req, HttpServletResponse resp){
		
		HttpSession session = req.getSession(false);
		
		if (session == null){
			System.out.println("Criando session...");
			session = req.getSession();
			
			// utilizado para testar se session is new
			if (session.isNew()){
				System.out.println("Session is new...");
			}
		}
		session.setAttribute("atributoInteger", new Integer(4));
	}
	
	/**
	 * Para realizar este teste, é necessário desabilitar os cookies do navegador
	 * 
	 * @param req
	 * @param resp
	 * @throws IOException
	 */
	void testeEncodingUrl(HttpServletRequest req, HttpServletResponse resp) throws IOException{
		PrintWriter pw = resp.getWriter();
		resp.setContentType("text/html");
		
		HttpSession s = req.getSession();
		if (s.isNew()){
			System.out.println("nova sessao");
		} else {
			System.out.println("obtida sessao antiga");
		}
		
		// desabilita os cookies do navegador para realizar este teste de encodeUrl
		// como desabilitar: https://support.mozilla.org/en-US/kb/enable-and-disable-cookies-website-preferences
		pw.println("<html>");
		pw.println("<body>");
		pw.println("<a href='" + resp.encodeUrl("teste.do") + "'>link encodeUrl</a>");
		pw.println("</body>");
		pw.println("</html>");
	}
	
	void testeEncodingRedirectUrl(HttpServletRequest req, HttpServletResponse resp) throws IOException{
		System.out.println("executando encodeRedirectURL...");
		HttpSession s = req.getSession();
		if (s.isNew()){
			System.out.println("nova sessao");
		} else {
			System.out.println("obtida sessao antiga");
		}
		s.setAttribute("nome", "Leandro");
		System.out.println("id session: " + s.getId());
		resp.sendRedirect(resp.encodeRedirectURL("recebeSolicitacaoSession.do"));
	}
}
