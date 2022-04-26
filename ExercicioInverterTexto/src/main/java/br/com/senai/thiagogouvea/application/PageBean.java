package br.com.senai.thiagogouvea.application;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.faces.context.Flash;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@RequestScoped
public class PageBean implements Serializable{
	String palavra;
	String invertido;

	public String getPalavra() {
		return palavra;
	}

	public void setPalavra(String palavra) {
		this.palavra = palavra;
	}
	
	public String getInvertido() {
		return invertido;
	}

	public void setInvertido(String invertido) {
		this.invertido = invertido;
	}

	@Inject
	private Flash flash;
	
	public String inverter() {
		String invertido = new StringBuilder(palavra).reverse().toString();
		flash.put("resultado", invertido);
		return "result";
	}
}
