package br.com.ocio.piquisaweb.dao;

//import java.awt.List;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
//import java.util.List;
import java.util.List;

import com.mysql.jdbc.PreparedStatement;

import br.com.ocio.piquisaweb.modelo.Games;

public class GamesDAO {
	
	private Connection con;
	public GamesDAO() throws Exception{
       this.con = new ConnectionFactory().getConnection();
    }
    public void  adiciona(Games a){
        String sql = "insert into games(codigo,nome,dtlancamento,descricao,classificaoidade,preco,img) "+"values(?,?,?,?,?,?,?)";
        
        try {
        	
            PreparedStatement stmt = (PreparedStatement)con.prepareStatement(sql);
            stmt.setString(1,a.getCodigo());
            stmt.setString(2,a.getNome());
            
            stmt.setDate(3, new Date(a.getDtLancamento().getTimeInMillis()));
            
            stmt.setString(4,a.getDescricao());
            stmt.setLong(5,a.getClassificaoIdade());
            stmt.setDouble(6,a.getPreco());
            stmt.setString(7, a.getImg());
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            
            throw new RuntimeException(e);
        }
        
    }
    
    public java.util.List<Games> getList() throws SQLException{
        

      java.util.List<Games> ga = new ArrayList<>();
      
          
          String sql = "SELECT * FROM games";
          PreparedStatement stmt =  (PreparedStatement)con.prepareStatement(sql);
          ResultSet rs = stmt.executeQuery();
      try {
          
          while (rs.next()) {
              
              Games gam = new Games();
              gam.setCodigo(rs.getString("codigo"));
              gam.setNome(rs.getString("nome"));
              
              Calendar data = Calendar.getInstance();
              data.setTime(rs.getDate("dtlancamento"));
              gam.setDtLancamento(data);
              gam.setDescricao(rs.getString("descricao"));
              gam.setClassificaoIdade(rs.getInt("classificaoidade"));
              gam.setPreco(rs.getDouble("preco"));
              gam.setImg(rs.getString("img"));
              ga.add(gam);
	
	
          	} 
          }catch (SQLException e) {
                throw new RuntimeException(e);
                       
            
            
      }
	return ga;
    }
    
    public java.util.List<Games> pesquisan(Games g) throws SQLException{
    	
    	String sql = "SELECT codigo,nome,dtlancamento,descricao,classificaoidade,preco FROM ocio.games WHERE nome LIKE '%"+ g.getNome()+"%'";
        
        java.util.List<Games> g1 = new ArrayList<Games>();
        
        PreparedStatement stmt =(PreparedStatement)  con.prepareStatement(sql);
    
        ResultSet rs = stmt.executeQuery();
        
        
        while (rs.next()) {
                Games ga = new Games();
                
                ga.setCodigo(rs.getString("codigo"));
                ga.setNome(rs.getString("nome"));
                ga.setDescricao(rs.getString("descricao"));
                Calendar data = Calendar.getInstance();
                data.setTime(rs.getDate("dtlancamento"));
                ga.setDtLancamento(data);
                ga.setClassificaoIdade(rs.getInt("classificaoidade"));
                ga.setPreco(rs.getDouble("preco"));
                ga.setImg("img");
                g1.add(ga);
                
                
            }
            rs.close();
            stmt.close();
            return g1;
                              
        }
                              
    public List<Games> pesquisac(Games g) throws SQLException{
    	
        String sql = "SELECT codigo,nome,dtlancamento,descricao,classificaoidade,preco"
                +" FROM games"
                +" WHERE codigo=?";
        
        java.util.List<Games> g1 = new ArrayList<Games>();
        PreparedStatement stmt =(PreparedStatement)  con.prepareStatement(sql);
        stmt.setString(1, g.getCodigo());
        ResultSet rs = stmt.executeQuery();
        
        
        while (rs.next()) {
                Games ga = new Games();
                
                ga.setCodigo(rs.getString("codigo"));
                ga.setNome(rs.getString("nome"));
                ga.setDescricao(rs.getString("descricao"));
                Calendar data = Calendar.getInstance();
                data.setTime(rs.getDate("dtlancamento"));
                ga.setDtLancamento(data);
                ga.setClassificaoIdade(rs.getInt("classificaoidade"));
                ga.setPreco(rs.getDouble("preco"));
                ga.setImg("img");
                g1.add(ga);
                
                
            }
            rs.close();
            stmt.close();
            return g1;
                              
        }
    
    public void deletar(Games p){
        String sql = "delete from ocio.games where codigo=? ";
        try {
            PreparedStatement stmt = (PreparedStatement) con.prepareStatement(sql);
            stmt.setString(1,p.getCodigo());
            
            stmt.execute();
            stmt.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    
    
    }
    
    public void atualizar(Games p){
        String sql = "update games set nome=?,dtlancamento=?,descricao=?,classificaoidade=?,preco=?,img=? where codigo = ?";
        try {
            PreparedStatement stmt = (PreparedStatement) con.prepareStatement(sql);
            stmt.setString(7,p.getCodigo());
           
            stmt.setString(1,p.getNome());
            stmt.setDate(2, new Date(p.getDtLancamento().getTimeInMillis()));
            stmt.setString(3,p.getDescricao());
            stmt.setLong(4,p.getClassificaoIdade());
            stmt.setDouble(5,p.getPreco());
            stmt.setString(6, p.getImg());
                 
            stmt.execute();
            stmt.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    
    
    }
    //teste nao copie 
    
    public Games pesquisa(String n,String c) throws SQLException{
    	
    	if (c == null) {
    		 String sql = "SELECT codigo,nome,dtlancamento,descricao,classificaoidade,preco,img"
    	                +" FROM ocio.games"
    	                +" WHERE nome LIKE '%"+n+"%'";
    	        PreparedStatement stmt =(PreparedStatement)  con.prepareStatement(sql);
    	        ResultSet rs = stmt.executeQuery();
    	        Games ga = new Games();
    	        while (rs.next()) {
    	                
    	                
    	                ga.setCodigo(rs.getString("codigo"));
    	                ga.setNome(rs.getString("nome"));
    	                ga.setDescricao(rs.getString("descricao"));
    	                Calendar data = Calendar.getInstance();
    	                data.setTime(rs.getDate("dtlancamento"));
    	                ga.setDtLancamento(data);
    	                ga.setClassificaoIdade(rs.getInt("classificaoidade"));
    	                ga.setImg(rs.getString("img"));
    	                
    	                
    	                
    	            }
    	            rs.close();
    	            stmt.close();
    	            return ga;
    	            
    	            
		}if(n == null){
			String sql = "SELECT codigo,nome,dtlancamento,descricao,classificaoidade,preco"
	                +" FROM ocio.games"
	                +" WHERE codigo="+c+"";
	        PreparedStatement stmt =(PreparedStatement)  con.prepareStatement(sql);
	        ResultSet rs = stmt.executeQuery();
	        Games ga = new Games();
	        while (rs.next()) {
	                
	                
	                ga.setCodigo(rs.getString("codigo"));
	                ga.setNome(rs.getString("nome"));
	                ga.setDescricao(rs.getString("descricao"));
	                Calendar data = Calendar.getInstance();
	                data.setTime(rs.getDate("dtlancamento"));
	                ga.setDtLancamento(data);
	                ga.setClassificaoIdade(rs.getInt("classificaoidade"));
	                ga.setPreco(rs.getDouble("preco"));
	                ga.setImg(rs.getString("img"));
	                
	                
	            }
	            rs.close();
	            stmt.close();
	            return ga;
			
		}
		return null;		
    	
    	
    	
    	
    }
    
    
}
      
          
          
          
          
          
          
          
          
          
          
          
          
