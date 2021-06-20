package br.com.ocio.piquisaweb.testeSeparadoCompletado;

import java.util.Calendar;

import br.com.ocio.piquisaweb.dao.GamesDAO;
import br.com.ocio.piquisaweb.modelo.Games;

public class testaAtualiza {

	public static void main(String[] args) throws Exception{
		

		GamesDAO g = (GamesDAO) new GamesDAO();
		Games g1 = (Games) new Games();
		
		g1.setCodigo("001");
		g1.setNome("War");
		g1.setDescricao("guerra ");
		
		Calendar data = Calendar.getInstance();
		data.set(2000,3, 1);
		
		g1.setDtLancamento(data);

		g1.setClassificaoIdade(18);
		
		g.atualizar(g1);
		System.out.println("Atualizado com Sucesso");
		
		
	}

}
