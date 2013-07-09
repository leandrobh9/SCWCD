<%@ page pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Cap 8 - Expression languages e objetos implícitos</title>
	</head>
<body>

	<h4>Cookie via EL: \${cookie.nome.value}</h4>
	<p>Nome: ${cookie.nome.value}</p>

	<h4>Atributo (pageScope, requestScope, etc) via EL:
		\${requestScope.sobrenome}</h4>
	<p>Sobrenome: ${requestScope.sobrenome}</p>

	<h4>Parâmetro (param) via EL \${param} e \${param.teste} (coloque
		?teste= na URL)</h4>
	<p>Param: ${param}</p>
	<h4>Parâmetro (paramValues) via EL \${paramValues['teste'][0]} -
		lembrar do caso de enviar mais um parâmetro com o mesmo nome</h4>
	<p>Param: ${paramValues['teste'][0]}</p>

	<h4>Parâmetros do Contexto (não é do JSP) \${initParam.veiculo}</h4>
	<p>Init Param (mas é do contexto): ${initParam.veiculo}</p>


</body>

</html>