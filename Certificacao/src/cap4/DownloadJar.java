package cap4;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.servlet.*;
import javax.servlet.http.*;

/**
 * Utilizacao de
 * setContentType
 * OutputStream
 * @author Leandro
 *
 */
public class DownloadJar extends HttpServlet {


	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		try{
			resp.setContentType("application/jar");
			ServletContext sc = getServletContext();
			InputStream is = sc.getResourceAsStream("WEB-INF/classes/ojdbc6.jar");

			/*
			 * Adding and Filtering External Web Resources
			 * The default resource directory for all Maven projects is src/main/resources which will end up in target/classes and in WEB-INF/classes in the WAR. The directory structure will be preserved in the process.
			 * The WAR Plugin is also capable of including resources not found in the default resource directory through the webResources parameter.
			 *  
			 */

			/*
			 * quando utilizado FileInputStream o caminho pode ser absoluto na 
			 * maquina do servidor
			 */
			//InputStream is = new FileInputStream("D:\\tmp\\ojdbc6.jar");

			OutputStream os = resp.getOutputStream();
			byte[] bytes = new byte[1024];
			int read = 0;

			while ( (read = is.read(bytes)) != -1 ){
				os.write(bytes, 0, read);
			}
			os.flush();
			os.close();
		}
		catch (Exception e){
			e.printStackTrace();
		}
	}
}
