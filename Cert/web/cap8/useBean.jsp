<%@ page pageEncoding="ISO-8859-1" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cap 8 - tela</title>
</head>
<body>

<!-- 1 -->
<!-- 
OBTER O VALOR SETADO DO SERVLET
<jsp:useBean id="minhapessoa" class="cap8.model.Pessoa" scope="request" />
<jsp:getProperty property="nome" name="minhapessoa" />
 -->
 
<!-- 2 -->
<!-- 
SERA CRIADO UM BEAN CONDICIONAL (SE NAO HOUVER COM O ID CITADO)
SERA SETADO A PROPRIEDADE INFORMADA

 <jsp:useBean id="minhapessoa1" class="cap8.model.Pessoa" scope="request">
 	<jsp:setProperty name="minhapessoa1" property="nome" value="Lucas1" />
 </jsp:useBean>
<jsp:getProperty property="nome" name="minhapessoa1" />
-->

<!-- 3 -->
<!-- OBTER VIA PARAMETRO -->
<!-- 
SERA CRIADO UM BEAN CONDICIONAL (SE NAO HOUVER COM O ID CITADO)
SERA SETADO A PROPRIEDADE INFORMADA

<jsp:useBean id="minhapessoa2" class="cap8.model.Pessoa" scope="request">
 	<jsp:setProperty name="minhapessoa2" property="nome" param="username" />
</jsp:useBean>
<jsp:getProperty property="nome" name="minhapessoa2" />
-->

</body>
</html>