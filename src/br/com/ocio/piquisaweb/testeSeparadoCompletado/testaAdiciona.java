package br.com.ocio.piquisaweb.testeSeparadoCompletado;

import java.util.Calendar;

import br.com.ocio.piquisaweb.dao.GamesDAO;
import br.com.ocio.piquisaweb.modelo.Games;

public class testaAdiciona {

	public static void main(String[] args) throws Exception {
		

		GamesDAO g = (GamesDAO) new GamesDAO();
		Games g1 = (Games) new Games();
		
		g1.setCodigo("001");
		g1.setNome("free fire");
		g1.setDescricao("tiro  ");
		
		Calendar data = Calendar.getInstance();
		data.set(2001,10, 5);
		
		g1.setDtLancamento(data);

		g1.setClassificaoIdade(15);
		g1.setPreco(100.00);
		
		g.adiciona(g1);
		System.out.println("Adicona com Sucesso");
		
		
		

	}

}
