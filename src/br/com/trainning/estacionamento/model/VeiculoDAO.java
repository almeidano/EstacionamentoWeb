package br.com.trainning.estacionamento.model;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.com.trainning.control.UsuarioNaoEncontradoException;
import br.com.trainning.control.VeiculoNaoEncontradoException;

public class VeiculoDAO extends BancoDadosDAO {

	public VeiculoDO registrarEntrada(VeiculoDO veiculoDO) throws Exception {
		abrirConexao();

		String sql = "insert into java.veiculo (placa, modelo, data,cor) values (?,?,?,?)";
		PreparedStatement preparedStatement = conexao.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);

		preparedStatement.setString(1, veiculoDO.getPlaca());
		preparedStatement.setString(2, veiculoDO.getModelo());
		// preparedStatement.setDate(3, (Date) veiculoDO.getDataHora());
		preparedStatement.setDate(3, (Date) veiculoDO.getData());
		preparedStatement.setString(4, veiculoDO.getCor());

		preparedStatement.executeUpdate();

		ResultSet rs = preparedStatement.getGeneratedKeys();
		if (rs.next()) {
			veiculoDO.setId(rs.getInt(1));
		}
		return veiculoDO;
	}

	public void excluirVeiculo(String placa) throws Exception {

		abrirConexao();

		String sql = "delete from java.veiculo where placa=?";
		PreparedStatement preparedStatement = conexao.prepareStatement(sql);

		preparedStatement.setString(1, placa);
		preparedStatement.executeUpdate();

		fecharConexao();

	}
		
	public List<VeiculoDO> obterVeiculo() throws Exception {

		abrirConexao();
		String sql = "select id, placa, modelo, cor from java.veiculo";
		PreparedStatement preparedStatement = conexao.prepareStatement(sql);

		List<VeiculoDO> lista = new ArrayList<VeiculoDO>();

		ResultSet resultSet = preparedStatement.executeQuery();

		 
		while (resultSet.next()) {

			VeiculoDO veiculoDO = new VeiculoDO();
			
			veiculoDO.setId(resultSet.getInt("Id"));
			veiculoDO.setPlaca(resultSet.getString("placa"));
			veiculoDO.setModelo(resultSet.getString("modelo"));
			veiculoDO.setData((Date) veiculoDO.getData());
			veiculoDO.setCor(resultSet.getString("cor"));
			
			
			lista.add(veiculoDO);

		} 

		fecharConexao();
		return lista;

	}

	public VeiculoDO obterVeiculoDO(String placa) throws Exception {

		abrirConexao();
		String sql = "select id, placa, modelo, data, cor from java.veiculo where placa=?";
		PreparedStatement preparedStatement = conexao.prepareStatement(sql);

		preparedStatement.setString(1, placa);

		ResultSet resultSet = preparedStatement.executeQuery();

		VeiculoDO veiculoDO = null;
		if (resultSet.next()) {

			veiculoDO = new VeiculoDO();
			veiculoDO.setId(resultSet.getInt("id"));
			veiculoDO.setPlaca(resultSet.getString("placa"));
			veiculoDO.setData((Date) veiculoDO.getData());
			veiculoDO.setModelo(resultSet.getString("modelo"));
			veiculoDO.setCor(resultSet.getString("cor"));
			
			
			
			
		} else {
			VeiculoNaoEncontradoException e = new VeiculoNaoEncontradoException();
			throw e;
			
		}

		fecharConexao();
		return veiculoDO;

	}

}
