package cap5.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class ServletContextListenerImpl implements ServletContextListener{

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("inicializado");
		Cachorro c = new Cachorro();
		c.setNome("Brucee");
		sce.getServletContext().setAttribute("cachorro", c);
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		System.out.println("finalizado");
	}
}
