package br.com.ocio.piquisaweb.testeSeparadoCompletado;

import br.com.ocio.piquisaweb.dao.GamesDAO;
import br.com.ocio.piquisaweb.modelo.Games;

public class testaDeleta {

	public static void main(String[] args) throws Exception {
		
		GamesDAO g = (GamesDAO) new GamesDAO();
		Games g1 = (Games) new Games();
		g1.setCodigo("001");
		
		g.deletar(g1);
		System.out.println("Deletado com Sucesso");

	}

}
