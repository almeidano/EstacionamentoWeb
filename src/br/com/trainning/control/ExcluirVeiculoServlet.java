package br.com.trainning.control;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import br.com.trainning.estacionamento.model.VeiculoDAO;


@WebServlet("/ExcluirVeiculoServlet")
public class ExcluirVeiculoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String placa = request.getParameter("placa");
		
try {
			
			request.getSession().removeAttribute("placa");
			VeiculoDAO dao = new VeiculoDAO();
			dao.excluirVeiculo(placa);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		response.sendRedirect("menuPrincipal.jsp");
		
	
	}
	

}

    
	