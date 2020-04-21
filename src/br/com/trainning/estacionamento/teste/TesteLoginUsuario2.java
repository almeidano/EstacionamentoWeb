package br.com.trainning.estacionamento.teste;

import br.com.trainning.estacionamento.model.UsuarioDAO;
import br.com.trainning.estacionamento.model.UsuarioDO;

public class TesteLoginUsuario2 {
	
	public static void main(String[] args) throws Exception {
		
		UsuarioDAO dao  =new UsuarioDAO();
		
		UsuarioDO u =  new UsuarioDO(0, "carla", "carla@gmail", "carla", "trocar");
		
		u = dao.incluir(u);
		
		System.out.println(u);
		
		
		
		
	}

}
