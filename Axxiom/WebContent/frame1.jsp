<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script src='http://code.jquery.com/jquery-1.8.3.js' type="text/javascript">
</script>
<script type="text/javascript">
	function mudaURL(idCriterio){
		window.location = '${pageContext.request.contextPath}/frame1.jsp?id=' + idCriterio;
		//alert(idCriterio)
	}
</script>
</head>
<body>
	
	<div id="leandro">leandro</div>

	<c:out value="Teste1"></c:out>
	
	<select name="Criterio" onchange="mudaURL(this.value)">
		<option value="FatorAtraso">Fator Atraso</option>
		<option value="FatorConsumo" >Classe de Consumo</option>
		<option value="FatorReducao" >Redução de Multa</option>   
	</select>
	
	<input type='submit' onclick='alert($("#leandro").text())' />
	
</body>
</html>
