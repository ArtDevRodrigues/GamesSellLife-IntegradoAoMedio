package br.com.ocio.piquisaweb.modelo;

import java.util.Calendar;


public class Games {
	
	private String nome;
	private String Codigo;
	private String descricao;
	private Calendar dtLancamento;
	private int classificaoIdade;
	private Double preco;
	private String img;

	public Games(String nome, String codigo, String descricao, Calendar dtLancamento, int classificaoIdade,Double preco,String img) {
		super();
		this.nome = nome;
		this.Codigo = codigo;
		this.descricao = descricao;
		this.dtLancamento = dtLancamento;
		this.classificaoIdade = classificaoIdade;
		this.preco=preco;
		this.img = img;
	}

	public Games() {
		// TODO Auto-generated constructor stub
	}

	public String getCodigo() {
		return Codigo;
	}

	public void setCodigo(String codigo) {
		Codigo = codigo;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public Calendar getDtLancamento() {
		return dtLancamento;
	}

	public void setDtLancamento(Calendar dtLancamento) {
		this.dtLancamento = dtLancamento;
	}

	public int getClassificaoIdade() {
		return classificaoIdade;
	}

	public void setClassificaoIdade(int classificaoIdade) {
		this.classificaoIdade = classificaoIdade;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}



	

}
