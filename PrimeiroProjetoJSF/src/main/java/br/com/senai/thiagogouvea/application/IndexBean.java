package br.com.senai.thiagogouvea.application;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@SuppressWarnings("serial")
@Named
@RequestScoped
public class IndexBean implements Serializable{
	
	//Metodo responsavel de retornar uma mensagem
	public String getMensagem() {
		return "Texto vindo do Bean";
	}
}
