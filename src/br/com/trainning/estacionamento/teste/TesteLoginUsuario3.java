package br.com.trainning.estacionamento.teste;

import java.util.List;

import br.com.trainning.estacionamento.model.UsuarioDAO;
import br.com.trainning.estacionamento.model.UsuarioDO;

public class TesteLoginUsuario3 {
	
	public static void main(String[] args) throws Exception {
		
		UsuarioDAO dao  =new UsuarioDAO();
		
	
		
		List<UsuarioDO> u = dao.obterUsuarios();
		
		for (UsuarioDO usuarioDO : u) {
			System.out.println(usuarioDO);
		}
		
		
		
		
	}

}
