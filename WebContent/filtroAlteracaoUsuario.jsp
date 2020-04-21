<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<%@include file="cabecalho.jsp" %>
	<body>
		<h1>Filtro de alteracao de usuarios</h1>
	
		<form method='post' action='ConsultaUsuarioAlteracaoServlet'>
		
			Entre com o login que deseja alterar: <input type='text' name='login'> 
			<input type='submit' value='buscar...'>
		
		
		</form>
	
	</body>
	<%@include file="rodape.jsp" %>
</html>