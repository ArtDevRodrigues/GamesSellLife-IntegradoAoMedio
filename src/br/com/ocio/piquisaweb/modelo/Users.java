package br.com.ocio.piquisaweb.modelo;

public class Users {

	private String email;
	private String pass;
	private int adm;
	
	public int getAdm() {
		return adm;
	}
	public void setAdm(int adm) {
		this.adm = adm;
	}
	public Users(String email,String pass,int adm){
		super();
		this.email= email;
		this.pass= pass;
		this.adm= adm;
		
	}
	public Users(){
		
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	
	
	
	
	
}
