package br.com.senai.thiagogouvea.application;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.faces.context.Flash;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@RequestScoped
public class PageBean implements Serializable{
	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	@Inject
	private Flash flash;
	
	//Metodo responsavel por retornar o nome do usuario
	public String processar() {
		flash.put("nomeDoUsuario", nome);
		
		return "result?faces-redirect=true";
	}
}
