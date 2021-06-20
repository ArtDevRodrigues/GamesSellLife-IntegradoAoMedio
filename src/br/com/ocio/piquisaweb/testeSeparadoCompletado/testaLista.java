 package br.com.ocio.piquisaweb.testeSeparadoCompletado;

import java.util.List;

import br.com.ocio.piquisaweb.dao.GamesDAO;
import br.com.ocio.piquisaweb.modelo.Games;

public class testaLista {

	public static void main(String[] args) throws Exception {
		
		GamesDAO g = new GamesDAO();
		List<Games> jogos = g.getList();
		System.out.println("Aqui esta a lista:");
		for(Games ga: jogos){
			System.out.print("codigo do jogo:");
			System.out.println(ga.getCodigo());
			System.out.print("nome do jogo:");
			System.out.println(ga.getNome());
			System.out.print("descricao do jogo:");
			System.out.println(ga.getDescricao());
			System.out.print("data de  lancamento do jogo:");			
			System.out.println(ga.getDtLancamento().getTime());
			System.out.print("classificacao de ideda do jogo:");
			System.out.println(ga.getClassificaoIdade());
			System.out.print("Preco do jogo:");
			System.out.println(ga.getPreco());
			System.out.print("seu diretorio:");
			System.out.println(ga.getImg());
			System.out.println("=================================================");
			
		}

	}

}
