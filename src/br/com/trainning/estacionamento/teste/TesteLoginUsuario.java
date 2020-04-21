package br.com.trainning.estacionamento.teste;

import br.com.trainning.estacionamento.model.UsuarioDAO;

public class TesteLoginUsuario {
	
	public static void main(String[] args) throws Exception {
		
		UsuarioDAO dao  =new UsuarioDAO();
		
		if(dao.validarLogin("ericotorres", "trocar")) {
			System.out.println("Usuario logado");
			
		} else {
			System.out.println("usuario/senha invalidos");
		}
		
		
		
		
		
		
	}

}
