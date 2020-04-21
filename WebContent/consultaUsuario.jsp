<%@page import="br.com.trainning.estacionamento.model.UsuarioDO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<%@include file="cabecalho.jsp" %>
	<body>
		<% 
			UsuarioDO usuarioDO =  (UsuarioDO) request.getSession().getAttribute("usuario");
		%>
		
		<table border=1>
			<tr>
				<td>Id</td>
				<td>Nome</td>
				<td>e-mail</td>
				<td>Login</td>
				<td>Senha</td>
			</tr>
			<tr>
				<td><%=usuarioDO.getId() %></td>
				<td><%=usuarioDO.getNome() %></td>
				<td><%=usuarioDO.getEmail()%></td>
				<td><%=usuarioDO.getUsername()%></td>
				<td><%=usuarioDO.getPassword()%></td>
			</tr>
		
		</table>
			<a href='menuPrincipal.jsp'>Voltar para Menu Principal</a>
			
	</body>
	
	<%@include file="rodape.jsp" %>
</html>