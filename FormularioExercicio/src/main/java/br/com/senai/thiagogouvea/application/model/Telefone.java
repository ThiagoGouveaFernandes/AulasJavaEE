package br.com.senai.thiagogouvea.application.model;

public class Telefone {
	//O enum facilita o manuseio de constantes nomeadas
	enum Tipo{
		FIXO, CELULAR;
	}
	
	private Tipo tipo;
	private String ddd;
	private String numero;
	
	
	public Tipo getTipo() {
		return tipo;
	}
	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}
	public String getDdd() {
		return ddd;
	}
	public void setDdd(String ddd) {
		this.ddd = ddd;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	
}
