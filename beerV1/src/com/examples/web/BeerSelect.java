
package com.examples.web;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import com.examples.model.*;
import java.util.*;

public class BeerSelect extends HttpServlet {
	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
				throws IOException, ServletException{
		
		String saida = "";
		BeerExpert b = new BeerExpert();
		String color = request.getParameter("color");
		List<String> l = b.getBrands(color);
		
		for(String a : l){
			saida += a + "<br />";
		}
		
		/*response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println(saida);*/
		request.setAttribute("styles", l);
		RequestDispatcher view = request.getRequestDispatcher("result.jsp");
		view.forward(request, response);
	}
}

