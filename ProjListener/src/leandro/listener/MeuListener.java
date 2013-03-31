
package leandro.listener;

import leandro.model.Carro;
import javax.servlet.*;



public class MeuListener implements ServletContextListener {

	public void contextInitialized(ServletContextEvent event){
	
		ServletContext sc = event.getServletContext();
		
		String cor = sc.getInitParameter("cor");
		
		Carro carro = new Carro(cor);
		
		sc.setAttribute("carro", carro);
	}
	
	public void contextDestroyed(ServletContextEvent event){
		
	}
}
