package br.com.trainning.control;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.trainning.estacionamento.model.UsuarioDAO;
import br.com.trainning.estacionamento.model.UsuarioDO;

@WebServlet("/AlterarUsuarioServlet")
public class AlterarUsuarioServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		
		UsuarioDO usuarioDO =new UsuarioDO();
		usuarioDO.setId(Integer.parseInt(request.getParameter("id")));
 		usuarioDO.setNome(request.getParameter("nome"));
 		usuarioDO.setEmail(request.getParameter("email"));
 		usuarioDO.setUsername(request.getParameter("user"));
 		usuarioDO.setPassword(request.getParameter("pass"));
 		
		
		
		try {
			
			request.getSession().removeAttribute("usuario");
			UsuarioDAO dao = new UsuarioDAO();
			dao.alterar(usuarioDO);
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		request.getSession().setAttribute("mensagem", "Usuario " + usuarioDO.getNome() + " foi alterado com sucesso !!!");
		response.sendRedirect("menuPrincipal.jsp");
		
	
	}

}
