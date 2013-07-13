package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.entidades.Pessoa;
import com.google.gson.Gson;
import com.manager.PessoaManager;

public class PrincipalServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		PessoaManager pessoaManager = new PessoaManager();
		List<Pessoa> lista = pessoaManager.getLista();
		Gson gson = new Gson();
		
		//resp.setContentType("application/json");
		
		PrintWriter out = resp.getWriter();
		out.print(gson.toJson(lista));
		out.flush();
	}
}
