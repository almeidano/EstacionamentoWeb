<%@page import="br.com.trainning.estacionamento.model.VeiculoDO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Inclusão de Veiculo</title>
</head>
<body>
<%@include file="cabecalho.jsp" %>

	<h1>Inclusao de Veiculo</h1>

	<form name='frmInclusaoVeiculo' method='post' action='InclusaoVeiculoServlet'>


		<table border=1>

			<tr>
				<td>placa</td>
				<td><input type='text' name='placa'></td>
			</tr>
			<tr>
				<td>modelo</td>
				<td><input type='text' name='modelo'></td>
			</tr>
			
			<!--  
			<tr>
				<td>data</td>
				<td><input type='hidden' name='data'></td>
			</tr>
			-->
			<tr>
			
				<td>cor</td>
				<td><input type='text' name='cor'></td>
			</tr>
			
			<tr>
				<td><input type='submit'value ='submeter'></td>
				<td><input type='reset'value ='limpar'></td>
			</tr>

		</table>




	</form>
</body>

<%@include file="rodape.jsp" %>
</html>