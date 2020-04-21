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

		<h1>Alteração</h1>

		<form action='AlterarUsuarioServlet' method='post'>
		
		
			<table border=1>
				<tr>
					<td>Id</td> 
					<td>
						<input type='text' name='id' readonly value='<%=usuarioDO.getId()%>'%>
					</td>
				</tr>
				<tr>
					<td>Nome</td><td><input type='text' name='nome'  value='<%=usuarioDO.getNome() %>'%></td>
				</tr>
				<tr>
					<td>e-mail</td><td><input type='text' name='email'  value='<%=usuarioDO.getEmail()%>'%></td>
				</tr>
				<tr>
					<td>Login</td><td><input type='text' name='user'  value='<%=usuarioDO.getUsername()%>'%></td>
				</tr>
				<tr>
					<td>Senha</td><td><input type='text' name='pass'  value='<%=usuarioDO.getPassword()%>'%></td>
				</tr>
			
			</table>
					
			<input type='submit'>
		
		</form>		
	
			
	</body>
	
	<%@include file="rodape.jsp" %>
</html>