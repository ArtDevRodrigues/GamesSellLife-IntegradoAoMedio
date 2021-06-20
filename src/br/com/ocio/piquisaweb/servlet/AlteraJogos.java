 package br.com.ocio.piquisaweb.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.ocio.piquisaweb.dao.GamesDAO;
import br.com.ocio.piquisaweb.modelo.Games;

/**
 * Servlet implementation class alteraJogos
 */
@WebServlet("/alteraJogos")
public class AlteraJogos extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AlteraJogos() {
        super();
        // TODO Auto-generated constructor stub
    }

 protected void service(HttpServletRequest request, HttpServletResponse  response) throws ServletException, IOException {
	
			
		// lendo dados do formulario
    	String cod = request.getParameter("cod");
    	String no = request.getParameter("No");
    	String des = request.getParameter("Em");
    	String dtl = request.getParameter("Mes");
    	String ci = request.getParameter("ci");
    	String pre = request.getParameter("pre");
    	String img = request.getParameter("img");
    	
    	PrintWriter o = response.getWriter();
    	try {
    		Games g1 = new Games();
			GamesDAO g = new GamesDAO();
			Date dtlc =  new SimpleDateFormat("yyyy-MM-dd").parse(dtl);
			
			Calendar data = Calendar.getInstance();
			data.setTime(dtlc);
	
			
			int classi = Integer.parseInt(ci);
			g1.setCodigo(cod);
			g1.setNome(no);  
			g1.setDescricao(des);
			g1.setImg(img);
			
					
			g1.setDtLancamento(data);
			g1.setClassificaoIdade(classi);
			double preco= Double.parseDouble(pre);
			g1.setPreco(preco);
			
			g.atualizar(g1);
			o.println("Adiconado com Sucesso");
			
		} catch (Exception e) {
			o.println("Erro ao Inserir");
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	response.sendRedirect("/priquisa/jspPags/BibliotecaAdm_v1.jsp");
    			
	} 


    
}
