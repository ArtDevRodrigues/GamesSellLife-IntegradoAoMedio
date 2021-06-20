package br.com.ocio.piquisaweb.teste;

import java.sql.Connection;

import br.com.ocio.piquisaweb.dao.ConnectionFactory;

/**
 * @author info3ano
 *
 */
/**
 * @author info3ano
 *
 */
public class TestaConexao {
	
	
	/**
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args)throws Exception {
		
		Connection con = new ConnectionFactory().getConnection();
		System.out.println("Conexao Aberta  ");
		
		
		con.close();
		
	}

}
