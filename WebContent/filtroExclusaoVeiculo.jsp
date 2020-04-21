<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<%@include file="cabecalho.jsp" %>
	
	<body>
		<h1>Filtro de exclusao de veiculos por  placa</h1>
	
		<form method='post' action='ConsultaExcluirVeiculoServlet'>
		
			Entre com a placa que deseja buscar: <input type='text' name='placa'> 
			<input type='submit' value='buscar...'>
		
		
		</form>
	
	</body>
	
	<%@include file="rodape.jsp" %>
</html>