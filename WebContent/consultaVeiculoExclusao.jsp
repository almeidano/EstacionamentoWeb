<%@page import="br.com.trainning.estacionamento.model.VeiculoDO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<%@include file="cabecalho.jsp" %>
	<body>
		<% 
			VeiculoDO veiculoDO =  (VeiculoDO) request.getSession().getAttribute("placa");
		%>

		<h1>Confirma a exclusao desse veiculo ?</h1>

		<form action='ExcluirVeiculoServlet' method='post'>
		
		
			<table border=1>
				<tr>
					<td>Id</td> 
					<td>
						<input type='text' name='id' readonly value='<%=veiculoDO.getId()%>'%>
					</td>
				</tr>
				<tr>
					<td>Placa</td><td><input type='text' name='placa' readonly value='<%=veiculoDO.getPlaca() %>'%></td>
				</tr>
				<tr>
					<td>Modelo</td><td><input type='text' name='modelo' readonly value='<%=veiculoDO.getModelo()%>'%></td>
				</tr>
				
				<tr>
					<td>Cor</td><td><input type='text' name='cor' readonly value='<%=veiculoDO.getCor()%>'%></td>
				</tr>
			
			</table>
					
			<input type='submit'>
		
		</form>		
	
			
	</body>
	
	<%@include file="rodape.jsp" %>
</html>