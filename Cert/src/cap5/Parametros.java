package cap5;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("unchecked")
public class Parametros extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		PrintWriter pw = resp.getWriter();
		
		/*
		 * context-param Parametros de contexto
		 */
		ServletContext sc = getServletContext();
		
		for (String indice : this.enumeratedToList(sc.getInitParameterNames())){
			pw.print(indice + ": " + sc.getInitParameter(indice));
		}
		
		/*
		 * init-param
		 * Parametros de Servlet
		 */
		for (String indice : this.enumeratedToList(getServletConfig().getInitParameterNames())){
			pw.print(indice + ": " + getServletConfig().getInitParameter(indice));
		}
	}
	
	public List<String> enumeratedToList(Enumeration<String> e){
		List<String> lista = new ArrayList<String>();
		while (e.hasMoreElements()){
			lista.add(e.nextElement());
		}
		return lista;
	}
}
