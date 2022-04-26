package br.com.senai.thiagogouvea.application;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.faces.context.Flash;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@RequestScoped
public class PageBean implements Serializable{
	private StringBuilder palavra;

	public StringBuilder getPalavra() {
		return palavra;
	}

	public void setPalavra(StringBuilder palavra) {
		this.palavra = palavra;
	}

	@Inject
	private Flash flash;
	
	public String inverter() {
		flash.put("resultado", palavra.reverse());
		
		return "result?faces-redirect=true";
	}
}
