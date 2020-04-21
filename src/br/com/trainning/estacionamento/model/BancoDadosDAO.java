package br.com.trainning.estacionamento.model;

import java.sql.Connection;
import java.sql.DriverManager;

public abstract class BancoDadosDAO {

	protected Connection conexao;
	
	protected void abrirConexao() throws Exception {
		
		Class.forName("org.postgresql.Driver");
		String url = "jdbc:postgresql://localhost:5432/trainning";
		String user = "postgres";
		String pass = "postgres";
		
		conexao = DriverManager.getConnection(url, user, pass);

	}
	
	protected void fecharConexao() throws Exception {
		if(conexao != null && !conexao.isClosed()) {
			conexao.close();
		}
	}
	
	
}
