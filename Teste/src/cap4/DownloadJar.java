package cap4;

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
			InputStream is = sc.getResourceAsStream("ojdbc6.jar");

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
		//		resp.getWriter().println("teste...");
	}
}
