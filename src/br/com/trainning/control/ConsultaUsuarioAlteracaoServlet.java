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

/**
 * Servlet implementation class ConsultaUsuarioServlet
 */
@WebServlet("/ConsultaUsuarioAlteracaoServlet")
public class ConsultaUsuarioAlteracaoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

 		String login =  request.getParameter("login");
 		
 		UsuarioDAO dao = new UsuarioDAO();
 		try {
			
 			UsuarioDO usuarioDO = dao.obterUsuarioDO(login);
			request.getSession().setAttribute("usuario", usuarioDO);
 			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
 		
 		
 		RequestDispatcher rd = request.getRequestDispatcher("consultaUsuarioAlteracao.jsp");
 		rd.forward(request, response);
 		
 		
	}
 	

}
