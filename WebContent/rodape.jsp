
<%@page import="br.com.trainning.estacionamento.model.UsuarioDO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<body>
	<hr>

	<%
		UsuarioDO usuario = (UsuarioDO) request.getSession().getAttribute("usuarioLogado");
	%>


	Usuario logado:
	<%=usuario.getNome()%>
	-
	<a href='EncerrarServlet'>Encerrar sessão</a> -
	<a href='menuPrincipal.jsp'>Voltar para Menu Principal</a>
	
</body>
</html>