package br.com.trainning.estacionamento.teste;

import java.util.List;

import br.com.trainning.estacionamento.model.UsuarioDAO;
import br.com.trainning.estacionamento.model.UsuarioDO;

public class TesteLoginUsuario4 {
	
	public static void main(String[] args) throws Exception {
		
		UsuarioDAO dao  =new UsuarioDAO();
		
	
		
		List<UsuarioDO> u = dao.obterUsuarios();
		
		for (UsuarioDO usuarioDO : u) {
			System.out.println(usuarioDO);
		}
		
		UsuarioDO usuarioAlterado = u.get(0);
		usuarioAlterado.setNome("erico correa torres");
		
		dao.alterar(usuarioAlterado);
		
		u = dao.obterUsuarios();
		
		for (UsuarioDO usuarioDO : u) {
			System.out.println(usuarioDO);
		}
		
	}

}
