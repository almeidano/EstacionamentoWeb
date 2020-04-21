<%@page import="br.com.trainning.estacionamento.model.UsuarioDO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Inclusão de Usuario</title>
</head>
<body>
<%@include file="cabecalho.jsp" %>

	<h1>Inclusao de Usuario</h1>

	<form name='frmInclusaoUsuario' method='post' action='InclusaoUsuarioServlet'>


		<table border=1>

			<tr>
				<td>Nome</td>
				<td><input type='text' name='nome'></td>
			</tr>
			<tr>
				<td>e-mail</td>
				<td><input type='text' name='email'></td>
			</tr>
			<tr>
				<td>Login</td>
				<td><input type='text' name='user'></td>
			</tr>
			<tr>
				<td>Senha</td>
				<td><input type='password' name='pass'></td>
			</tr>

			<tr>
				<td><input type='submit'></td>
				<td><input type='reset'></td>
			</tr>

		</table>




	</form>
</body>

<%@include file="rodape.jsp" %>
</html>