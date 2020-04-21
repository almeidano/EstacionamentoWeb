<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<%@include file="cabecalho.jsp" %>
	<body>
		<h1>Filtro de consulta de usuarios por login</h1>
	
		<hr>
			<%=request.getSession().getAttribute("mensagem") %>
		<hr>
		
		<form method='post' action='ConsultaUsuarioServlet'>
		
			Entre com o login que deseja buscar: <input type='text' name='login'> 
			<input type='submit' value='buscar...'>
		
		
		</form>
	
		<a href='menuPrincipal.jsp'>Voltar para Menu Principal</a>
	
	</body>
	
	<%@include file="rodape.jsp" %>
</html>