package br.com.ocio.piquisaweb.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.ocio.piquisaweb.dao.UserDAO;


/**
 * Servlet implementation class s
 */
@WebServlet("/o")
public class testaServlet extends HttpServlet {
	
           
	/**
	 * 
	 */
	private static final long serialVersionUID = 1261290061601261345L;

	@Override  
	protected void service(HttpServletRequest request, HttpServletResponse  response) throws ServletException, IOException {
		String un = "arthur@adm.gsl";
		String pw = "1234";
	
		
		
		
		UserDAO u;
		try {
			u = new UserDAO();
			
			if(u.name(un,pw)==1){
				
				response.sendRedirect("http://localhost:8080/priquisa/paginasExtras/BibliotecaAdm.html");
				
				
			}else if (u.name(un,pw)== 0){
				
				response.sendRedirect("http://localhost:8080/priquisa/paginasExtras/BibliotecaCliente.html");
			
			

		
		
			}	
		
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
	}

}
