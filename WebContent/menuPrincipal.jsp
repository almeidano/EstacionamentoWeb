<%@page import="br.com.trainning.estacionamento.model.UsuarioDO"%>
<%@page import="br.com.trainning.estacionamento.model.VeiculoDO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Sistema Estacionamento</title>
	</head>
	
	<%@include file="cabecalho.jsp" %>
	
	<body>
		<h1>Menu Principal</h1>
		<hr>
			Mensagem: <%=request.getSession().getAttribute("mensagem") %>
		<hr>

		<a href='inclusaoUsuario.jsp'>Incluir Usuário</a><br>
		<a href='filtroAlteracaoUsuario.jsp'>Alterar Usuário</a><br>
		<a href='ConsultaTodosUsuariosServlet'>Consultar Usuários</a><br>
		<a href='filtroConsultaUsuario.jsp'>Consultar Usuário por Login</a><br>
		<a href='filtroExclusaoUsuario.jsp'>Excluir Usuário por Login</a><br>
		<a href='inclusaoVeiculo.jsp'>Incluir Veiculo</a><br>
		<a href='filtroExclusaoVeiculo.jsp'>Exclusao Veiculo</a>
		<br>
			
	</body>
	
	<%@include file="rodape.jsp" %>
	
</html>