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

		<a href='inclusaoUsuario.jsp'>Incluir Usu�rio</a><br>
		<a href='filtroAlteracaoUsuario.jsp'>Alterar Usu�rio</a><br>
		<a href='ConsultaTodosUsuariosServlet'>Consultar Usu�rios</a><br>
		<a href='filtroConsultaUsuario.jsp'>Consultar Usu�rio por Login</a><br>
		<a href='filtroExclusaoUsuario.jsp'>Excluir Usu�rio por Login</a><br>
		<a href='inclusaoVeiculo.jsp'>Incluir Veiculo</a><br>
		<a href='filtroExclusaoVeiculo.jsp'>Exclusao Veiculo</a>
		<br>
			
	</body>
	
	<%@include file="rodape.jsp" %>
	
</html>