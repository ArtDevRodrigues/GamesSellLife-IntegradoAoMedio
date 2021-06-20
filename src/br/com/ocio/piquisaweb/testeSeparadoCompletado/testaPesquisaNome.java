package br.com.ocio.piquisaweb.testeSeparadoCompletado;

import java.util.List;

import br.com.ocio.piquisaweb.dao.GamesDAO;
import br.com.ocio.piquisaweb.modelo.Games;

public class testaPesquisaNome {

	public static void main(String[] args) throws Exception {
		
		Games g = new Games();
		g.setNome("f");
		
		GamesDAO g1 = new GamesDAO();
		List<Games> g2 =  (List<Games>) g1.pesquisan(g);
		for(Games ga: g2){
			System.out.println("Aqui esta a lista:");
		
			System.out.println("codigo do jogo: "+ga.getCodigo());
			
			System.out.println("Nome do jogo: "+ga.getNome());		
			
			System.out.println("Descricao do jogo: "+ga.getDescricao());
			
			System.out.println("data de lancamento do jogo: "+ga.getDtLancamento().getTime());
			
			System.out.println("classificacao de idade do jogo: "+ga.getClassificaoIdade());
			System.out.println("=================================================");
		
		
		
		}
		
	}

}
