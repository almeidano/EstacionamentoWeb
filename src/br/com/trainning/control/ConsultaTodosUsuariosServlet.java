package br.com.trainning.control;

import java.io.IOException;
import java.util.List;

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
@WebServlet("/ConsultaTodosUsuariosServlet")
public class ConsultaTodosUsuariosServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

 		
 		String destino = "consultaTodosUsuarios.jsp";
 		
 		UsuarioDAO dao = new UsuarioDAO();
 		try {
			
 			List<UsuarioDO>lista = dao.obterUsuarios();
 			
 			
			request.getSession().setAttribute("lista", lista);
			
			request.getSession().setAttribute("mensagem", "");
		} catch (Exception e) {
			
			
			
		}
 		
 		
 		RequestDispatcher rd = request.getRequestDispatcher(destino);
 		rd.forward(request, response);
 		
 		
	}
 	

}
