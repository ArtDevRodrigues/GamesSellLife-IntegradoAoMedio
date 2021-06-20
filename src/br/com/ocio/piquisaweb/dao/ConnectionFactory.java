package br.com.ocio.piquisaweb.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	public Connection getConnection(){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			return DriverManager.getConnection("jdbc:mysql://localhost:3306/ocio","root","root");
		
		} catch (SQLException | ClassNotFoundException e ) {
			throw new RuntimeException(e);
		}
		
		
	}
			
}
