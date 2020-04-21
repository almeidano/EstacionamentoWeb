package br.com.trainning.estacionamento.model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.com.trainning.control.UsuarioNaoEncontradoException;

public class UsuarioDAO extends BancoDadosDAO {

	public UsuarioDO incluir(UsuarioDO usuarioDO) throws Exception {
		abrirConexao();
		
		
		String sql = "insert into estacionamento.usuario (nome, email, username, password) values (?,?,?,?)";
		PreparedStatement preparedStatement = conexao.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);

		preparedStatement.setString(1, usuarioDO.getNome());
		preparedStatement.setString(2, usuarioDO.getEmail());
		preparedStatement.setString(3, usuarioDO.getUsername());
		preparedStatement.setString(4, usuarioDO.getPassword());
		
		preparedStatement.executeUpdate();
		
		ResultSet rs = preparedStatement.getGeneratedKeys();
		if(rs.next()) {
			usuarioDO.setId(rs.getInt(1));
			
		}
		
		
		fecharConexao();
		
		return usuarioDO;
		
	}

	public void alterar(UsuarioDO usuarioDO) throws Exception {
		abrirConexao();
				
		String sql = "update estacionamento.usuario set nome=?, email=?, username=?, password=? where id=?";
		PreparedStatement preparedStatement = conexao.prepareStatement(sql);

		preparedStatement.setString(1, usuarioDO.getNome());
		preparedStatement.setString(2, usuarioDO.getEmail());
		preparedStatement.setString(3, usuarioDO.getUsername());
		preparedStatement.setString(4, usuarioDO.getPassword());
		preparedStatement.setInt(5, usuarioDO.getId());
				
		preparedStatement.executeUpdate();
		
		
		fecharConexao();
		
		
		
	}


	
	public void excluir(String login) throws Exception {
		
		abrirConexao();
		String sql = "delete from estacionamento.usuario where username=?";
		PreparedStatement preparedStatement = conexao.prepareStatement(sql);

		preparedStatement.setString(1, login);
		preparedStatement.executeUpdate();
		
		fecharConexao();
		
	}
	
	public List<UsuarioDO> obterUsuarios() throws Exception {

		abrirConexao();
		String sql = "select id, nome, email, username, password from estacionamento.usuario";
		PreparedStatement preparedStatement = conexao.prepareStatement(sql);

		List<UsuarioDO> lista = new ArrayList<UsuarioDO>();

		ResultSet resultSet = preparedStatement.executeQuery();

		 
		while (resultSet.next()) {

			UsuarioDO usuarioDO = new UsuarioDO();
			usuarioDO.setId(resultSet.getInt("id"));
			usuarioDO.setNome(resultSet.getString("nome"));
			usuarioDO.setEmail(resultSet.getString("email"));
			usuarioDO.setUsername(resultSet.getString("username"));
			usuarioDO.setPassword(resultSet.getString("password"));
			
			lista.add(usuarioDO);

		} 

		fecharConexao();
		return lista;

	}
	
	public UsuarioDO obterUsuarioDO(String login) throws Exception {

		abrirConexao();
		String sql = "select id, nome, email, username, password from estacionamento.usuario where username=?";
		PreparedStatement preparedStatement = conexao.prepareStatement(sql);

		preparedStatement.setString(1, login);

		ResultSet resultSet = preparedStatement.executeQuery();

		UsuarioDO usuarioDO = null;
		if (resultSet.next()) {

			usuarioDO = new UsuarioDO();
			usuarioDO.setId(resultSet.getInt("id"));
			usuarioDO.setNome(resultSet.getString("nome"));
			usuarioDO.setEmail(resultSet.getString("email"));
			usuarioDO.setUsername(resultSet.getString("username"));
			usuarioDO.setPassword(resultSet.getString("password"));

		} else {
			UsuarioNaoEncontradoException e = new UsuarioNaoEncontradoException();
			throw e;
			
		}

		fecharConexao();
		return usuarioDO;

	}

	public boolean validarLogin(String user, String pass) throws Exception {

		UsuarioDO usuario = obterUsuarioDO(user);

		if (usuario != null) {

			boolean senhaOk = usuario.getPassword().equals(pass);
			if (senhaOk) {
				System.out.println(usuario);
				System.out.println("logado com sucesso");
				return true;
			}
		}

		return false;
	}
}
