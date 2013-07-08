<%@ page import="com.leandro.*" %>

<%
A a = new A();
String nome = a.getNome(); 
pageContext.setAttribute("nomePage", nome);
pageContext.setAttribute("nomeApplication", nome, pageContext.APPLICATION_SCOPE);
out.println("Nome: " + pageContext.getAttribute("nome"));
response.sendRedirect("minhaPagina2.jsp");
%>

