package br.com.senai.thiagogouvea.application.bean;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named("login")
@RequestScoped
public class LoginBean implements Serializable{
	private String nome;
	private String senha;
	
	//Essa anotação executa o metodo abaixo assim q essa classe for construida
	@PostConstruct
	public void onCreate() {
		System.out.println("Bean criado");
	}
	
	//Essa anotação executa o metodo abaixo assimq essa classe for destruida
	@PreDestroy
	public void onDestroy() {
		System.out.println("Bean será Destruído");
	}

	
	
	public String doLogin() {
		if("abc".equals(nome) && "123".equals(senha)) {
			System.out.println("qqqqq");
			return "despesas";
		}
		return null;
	}
	
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
}
