package br.com.ocio.piquisaweb.teste;

import java.util.ArrayList;
import java.util.List;




import br.com.ocio.piquisaweb.dao.UserDAO;

import br.com.ocio.piquisaweb.modelo.Users;

public class teste {

	

	public static void main(String[] args) throws Exception {
		
		 UserDAO u = new UserDAO();
		 List<Users> user = u.ListUsers();
		 ArrayList<Object> email = new ArrayList<>();
		 ArrayList<Object> pass = new ArrayList<>();
		 ArrayList<Object> adm = new ArrayList<>();
		
			
			for(Users us: user){
				email.add(us.getEmail());
				pass.add(us.getPass());
				adm.add(us.getAdm());
				System.out.println(us.getAdm());
				System.out.println(us.getEmail());
				System.out.println(us.getPass());
				System.out.println("=======================================");
				
				System.out.println("###############################");
				System.out.println(user.indexOf(2));
				System.out.println("###############################");
				
				
				
				
			}
			System.out.println("=================================================");
			System.out.println(email +" // "+pass+" \\ "+ adm);
			System.out.println("=================================================");
			
			
			
		
		
		//g.pesquisa("god","");
			
				
		

		}
		
		
		
			}

	


