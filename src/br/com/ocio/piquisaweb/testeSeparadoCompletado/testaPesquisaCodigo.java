package br.com.ocio.piquisaweb.testeSeparadoCompletado;

import java.util.List;

import br.com.ocio.piquisaweb.dao.GamesDAO;
import br.com.ocio.piquisaweb.modelo.Games;

public class testaPesquisaCodigo {

	public static void main(String[] args) throws Exception {
		Games g = new Games();
		g.setCodigo("001");
		
		GamesDAO g1 = new GamesDAO();
		List<Games> g2 =  ((List<Games>) g1.pesquisac(g));
		
		for(Games ga: g2){
			System.out.println("Aqui esta a lista:");
			System.out.print("codigo do jogo:");
			System.out.println(ga.getCodigo());
			System.out.print("Nome do jogo:");
			System.out.println(ga.getNome());		
			System.out.print("Descricao do jogo:");
			System.out.println(ga.getDescricao());
			System.out.print("data de lancamento do jogo:");
			System.out.println(ga.getDtLancamento().getTime());
			System.out.print("classificacao de idade do jogo:");
			System.out.println(ga.getClassificaoIdade());
			System.out.print("Preco do jogo:");
			System.out.println(ga.getPreco());
			System.out.println("=================================================");
		
		
		
		}
		
	}
}
