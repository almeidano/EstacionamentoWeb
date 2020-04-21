package br.com.trainning.control;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.trainning.estacionamento.model.UsuarioDAO;
import br.com.trainning.estacionamento.model.UsuarioDO;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String loginUsuario = request.getParameter("txtLogin");
		String senhaUsuario = request.getParameter("txtSenha");
		
		System.out.println("usuario:" + loginUsuario);
		System.out.println("senha:" + senhaUsuario);
		
		String destino = null;
		
		try {
			UsuarioDAO dao = new UsuarioDAO();
			if(dao.validarLogin(loginUsuario, senhaUsuario)) {
				System.out.println("ok");
				destino = "menuPrincipal.jsp";
				
				request.getSession().setAttribute("mensagem", "Seja bem vindo " + loginUsuario);
				
				UsuarioDO usaurioDO = dao.obterUsuarioDO(loginUsuario);
				
				request.getSession().setAttribute("usuarioLogado", usaurioDO);
				
			}
		} catch (Exception e) {
			
			//e.printStackTrace();
			
			System.out.println("NOK");
			
			request.getSession().setAttribute("msg","Usuário ou Senha Inválidos. Tente Novamente!");
			destino = "index.jsp";
		}
		
		response.sendRedirect(destino);
		
	
	}

}
