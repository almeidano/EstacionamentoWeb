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
@WebServlet("/InclusaoUsuarioServlet")
public class InclusaoUsuarioServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

 		UsuarioDO usuarioDO =new UsuarioDO();
 		usuarioDO.setNome(request.getParameter("nome"));
 		usuarioDO.setEmail(request.getParameter("email"));
 		usuarioDO.setUsername(request.getParameter("user"));
 		usuarioDO.setPassword(request.getParameter("pass"));
 		
 		
 		UsuarioDAO dao = new UsuarioDAO();
 		try {
			
 			usuarioDO = dao.incluir(usuarioDO);
 			request.getSession().setAttribute("mensagem", "Usuario " + usuarioDO.getNome() + " foi incluido com o id " + usuarioDO.getId());
 			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
 		
 		
 		RequestDispatcher rd = request.getRequestDispatcher("menuPrincipal.jsp");
 		rd.forward(request, response);
 		
 		
	}
 	

}
