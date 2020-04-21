package br.com.trainning.estacionamento.teste;


import java.sql.Date;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.TimeZone;

import br.com.trainning.estacionamento.model.VeiculoDAO;
import br.com.trainning.estacionamento.model.VeiculoDO;

public class testeInserir {

	public static void main(String[] args) throws Exception {

				
		
		VeiculoDO veiculoDO = new VeiculoDO();
		veiculoDO.setPlaca("DFG253");
		veiculoDO.setModelo("Ford");
		veiculoDO.setData(new Date(System.currentTimeMillis()));
		//veiculoDO.setDataHora(Calendar.getInstance().getTime());
		veiculoDO.setCor("ROSA");

		System.out.println(veiculoDO);

		VeiculoDAO dao = new VeiculoDAO();

		try {
			veiculoDO = dao.registrarEntrada(veiculoDO);

		} catch (Exception e) {
			
			e.printStackTrace();
		}

		System.out.println("Incluiu");
		System.out.println(veiculoDO);
		

	}

}
