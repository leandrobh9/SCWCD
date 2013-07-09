<html>
<head><title>Testa form</title></head>
<body>

<form method="get" action="<%= request.getContextPath() %>/ServletCap8.do">
Nome: <input type="text" name="username" /><br />
<input type="submit" value="enviar" />
</form>

</body>
</html>