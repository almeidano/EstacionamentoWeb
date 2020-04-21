package br.com.trainning.control;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.trainning.estacionamento.model.UsuarioDAO;
import br.com.trainning.estacionamento.model.UsuarioDO;
import br.com.trainning.estacionamento.model.VeiculoDAO;
import br.com.trainning.estacionamento.model.VeiculoDO;


@WebServlet("/ConsultaExcluirVeiculoServlet")
public class ConsultaExcluirVeiculoServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;
       
 	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

 		String placa =  request.getParameter("placa");
 		
 		VeiculoDAO dao = new VeiculoDAO();
 		try {
			
 			VeiculoDO veiculoDO = dao.obterVeiculoDO(placa);
			request.getSession().setAttribute("placa", veiculoDO);
 			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
 		
 		
 		RequestDispatcher rd = request.getRequestDispatcher("consultaVeiculoExclusao.jsp");
 		rd.forward(request, response);
 		
 		
	}
 	

}
