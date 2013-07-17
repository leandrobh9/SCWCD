<jsp:useBean id="pessoa" class="cap8.model.PessoaFisica" scope="request"></jsp:useBean>

<jsp:useBean id="pessoa2" class="cap8.model.PessoaFisica" scope="request">
	<jsp:setProperty name="pessoa2" property="nome" value="Lucas" />
</jsp:useBean>

<html>
<body>

Id: <jsp:getProperty property="id" name="pessoa"/><br />
Nome: <jsp:getProperty property="nome" name="pessoa"/><br />
Id: <jsp:getProperty property="id" name="pessoa2"/><br />
Nome: <jsp:getProperty property="nome" name="pessoa2"/><br />

</body>
</html>