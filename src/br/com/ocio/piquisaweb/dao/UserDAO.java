package br.com.ocio.piquisaweb.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
//import java.util.Calendar;

import com.mysql.jdbc.PreparedStatement;

//import br.com.ocio.piquisaweb.modelo.Games;
import br.com.ocio.piquisaweb.modelo.Users;

public class UserDAO {
	
	private Connection con;
	public UserDAO() throws Exception{
       this.con = new ConnectionFactory().getConnection();
    }
	
	public java.util.List<Users> ListUsers() throws SQLException{
        

	      java.util.List<Users> ga = new ArrayList<>();
	      
	          
	          String sql = "SELECT * FROM users";
	          PreparedStatement stmt =  (PreparedStatement)con.prepareStatement(sql);
	          ResultSet rs = stmt.executeQuery();
	      try {
	          
	          while (rs.next()) {
	              Users u = new Users();
	              u.setAdm(rs.getInt("adm"));
	              u.setEmail(rs.getString("email"));
	              u.setPass(rs.getString("pass"));
	              ga.add(u);
	              
		
	          	}
	          }catch (SQLException e) {
	        	  throw new RuntimeException(e);
	                                 
	      }
		return ga;
	    }
	
	public int name(String e, String p) {
		int i = 0;
		try {
			
			 
			
			 
			PreparedStatement ps = (PreparedStatement) con.prepareStatement("select adm from users where email=? and pass=?");
			ps.setString(1, e);
			ps.setString(2, p);
	 
			ResultSet rs = ps.executeQuery();
	 
			while (rs.next()) {
				
					i= rs.getInt("adm");	
				
				}
				
			
			
			} catch (SQLException exception) {
				throw new RuntimeException(exception);
			}
		
		return i;
		
		
	}
	
}
