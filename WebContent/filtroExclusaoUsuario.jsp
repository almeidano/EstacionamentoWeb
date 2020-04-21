<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<%@include file="cabecalho.jsp" %>
	
	<body>
		<h1>Filtro de exclusao de usuarios por login</h1>
	
		<form method='post' action='ConsultaUsuarioExclusaoServlet'>
		
			Entre com o login que deseja buscar: <input type='text' name='login'> 
			<input type='submit' value='buscar...'>
		
		
		</form>
	
	</body>
	
	<%@include file="rodape.jsp" %>
</html>