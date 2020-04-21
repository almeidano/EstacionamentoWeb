<%@page import="br.com.trainning.estacionamento.model.UsuarioDO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sistema Estacionamento</title>
</head>
<body>

	<h1>
		<font color="red"> 
			<!-- "se for verdade" ? "entao faca isso" : "senao faca isso" -->
			<%=request.getSession().getAttribute("msg")==null ? "" : request.getSession().getAttribute("msg")%>
		</font>
	</h1>

	<form name='frmlogin' method='post' action='LoginServlet'>


		<table align='center'>

			<tr>
				<td>
					<h1>Login do Sistema Estacionamento</h1>
				</td>
			</tr>

			<tr>
				<td>

					<table align='center'>
						<!-- linha 1 -->
						<tr>
							<td>Login:</td>
							<td><input type='text' name='txtLogin' value=''>
							</td>
						</tr>
						<!-- linha 2 -->
						<tr>
							<td>Senha:</td>
							<td><input type='password' name='txtSenha' value=''>
							</td>
						</tr>
						<!-- linha 3 -->
						<tr>
							<td><input type='submit' value="Logar" autofocus="autofocus"></td>
							<td><input type='reset' value='Limpar'></td>
						</tr>

					</table>

				</td>
			</tr>

		</table>



	</form>


</body>
</html>