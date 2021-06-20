package br.com.ocio.piquisaweb.teste;

//import java.util.Calendar;
//import java.sql.Date;
import java.util.List;

import br.com.ocio.piquisaweb.dao.GamesDAO;
import br.com.ocio.piquisaweb.modelo.Games;

public class testatudo {

	public static void main(String[] args) throws Exception {
		GamesDAO g = new GamesDAO();
		List<Games> jogos = g.getList();
		for(Games ga: jogos){
			
			System.out.println(ga.getCodigo());
			System.out.println(ga.getNome());
			System.out.println(ga.getDescricao());
			
			System.out.println(ga.getDtLancamento().getTime());
			
			System.out.println(ga.getClassificaoIdade());
			
		}
		
		
		
		
	}

}
