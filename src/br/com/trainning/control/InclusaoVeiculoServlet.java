package br.com.trainning.control;

import java.io.IOException;
import java.sql.Date;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import br.com.trainning.estacionamento.model.VeiculoDAO;
import br.com.trainning.estacionamento.model.VeiculoDO;

/**
 * Servlet implementation classInclusaoVeiculoServlet
 */
@WebServlet("/InclusaoVeiculoServlet")
public class InclusaoVeiculoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

 		
 		VeiculoDO veiculoDO = new VeiculoDO();
 		
 		veiculoDO.setPlaca(request.getParameter("placa"));
 		veiculoDO.setModelo(request.getParameter("modelo"));
 		veiculoDO.setData(new Date(System.currentTimeMillis()));
 		veiculoDO.setCor(request.getParameter("cor"));
 		
 		
 		
 		VeiculoDAO dao = new VeiculoDAO();
 		try {
			
 			veiculoDO = dao.registrarEntrada(veiculoDO);
 			request.getSession().setAttribute("mensagem", "O Veiculo " + veiculoDO.getPlaca() + " foi incluido com o id " + veiculoDO.getId());
 			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
 		
 		
 		RequestDispatcher rd = request.getRequestDispatcher("menuPrincipal.jsp");
 		rd.forward(request, response);
 		
 		
	}
 	

}
