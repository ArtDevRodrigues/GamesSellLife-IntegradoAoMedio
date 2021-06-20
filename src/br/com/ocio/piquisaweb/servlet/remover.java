package br.com.ocio.piquisaweb.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import br.com.ocio.piquisaweb.dao.GamesDAO;
import br.com.ocio.piquisaweb.modelo.Games;

/**
 * Servlet implementation class remover
 */
@WebServlet("/remover")
public class remover extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public remover() {
        super();
        // TODO Auto-generated constructor stub
    }

    @Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    
    	GamesDAO g = null;
		try {
			g = (GamesDAO) new GamesDAO();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Games g1 = (Games) new Games();
		g1.setCodigo(request.getParameter("cod"));
		
		g.deletar(g1);
		response.sendRedirect("/priquisa/jspPags/BibliotecaAdm_v1.jsp");
		
		
	}

}
