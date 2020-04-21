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

		<h1>Confirma a exclusao desse usuario ?</h1>

		<form action='ExcluirUsuarioServlet' method='post'>
		
		
			<table border=1>
				<tr>
					<td>Id</td> 
					<td>
						<input type='text' name='id' readonly value='<%=usuarioDO.getId()%>'%>
					</td>
				</tr>
				<tr>
					<td>Nome</td><td><input type='text' name='nome' readonly value='<%=usuarioDO.getNome() %>'%></td>
				</tr>
				<tr>
					<td>e-mail</td><td><input type='text' name='email' readonly value='<%=usuarioDO.getEmail()%>'%></td>
				</tr>
				<tr>
					<td>Login</td><td><input type='text' name='user' readonly value='<%=usuarioDO.getUsername()%>'%></td>
				</tr>
				<tr>
					<td>Senha</td><td><input type='text' name='pass' readonly value='<%=usuarioDO.getPassword()%>'%></td>
				</tr>
			
			</table>
					
			<input type='submit'>
		
		</form>		
	
			
	</body>
	
	<%@include file="rodape.jsp" %>
</html>