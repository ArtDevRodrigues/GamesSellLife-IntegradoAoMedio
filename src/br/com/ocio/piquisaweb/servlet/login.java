package br.com.ocio.piquisaweb.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import br.com.ocio.piquisaweb.dao.UserDAO;


/**
 * Servlet implementation class login
 */
@WebServlet("/login")
public class login extends HttpServlet {
	
           
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// TODO Auto-generated method stub
		PrintWriter o = response.getWriter();
	
		String un = request.getParameter("email");
		String pw = request.getParameter("pass");
		
		UserDAO u;
		try {
			u = new UserDAO();
			
			if((u.name(un,pw)) == 1){
				
				response.sendRedirect("jspPags/BibliotecaAdm_v1.jsp");
				
				
			}else if((u.name(un,pw)) == 2){
				
				response.sendRedirect("jspPags/bibliotecaCli.jsp");

			}else {
				
				o.println("Erro ao Logar Tente Novamente ou Entre em Contato com o Suporte");
				
			}
		
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
		
		
	}
}


