package br.com.ocio.piquisaweb.teste;
   
//import java.util.ArrayList;
import java.util.Calendar;
//import java.util.List;

//import br.com.ocio.piquisaweb.dao.GamesDAO;
import br.com.ocio.piquisaweb.modelo.Games;

public class Testabanco {

	
	//@SuppressWarnings("deprecation")
	public static void main(String[] args) throws Exception  {
		
		//GamesDAO g = (GamesDAO) new GamesDAO();
		Games g1 = (Games) new Games();
		
		g1.setCodigo("125");
		g1.setNome("God Of War");
		g1.setDescricao("P ");
		
		Calendar data = Calendar.getInstance();
		data.set(2000,3, 1);
		
		g1.setDtLancamento(data);

		g1.setClassificaoIdade(18);
		//codigos ja testados 
		
		//g.deletar(g1);
		//g.adiciona(g1);
		//g.atualizar(g1);
		
		 
		//Games g2;
		
//		g2 = g.pesquisa("God Of War");
//		System.out.println(g2.getCodigo());
//		System.out.println(g2.getNome());
//		System.out.println(g2.getDescricao());
//		
//		System.out.println(g2.getDtLancamento().getTime());
//		System.out.println(g2.getClassificaoIdade());
		
		
		
		
		
		
		
	}

}
