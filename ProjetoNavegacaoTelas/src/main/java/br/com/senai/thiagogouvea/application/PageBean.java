package br.com.senai.thiagogouvea.application;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@SuppressWarnings("serial")
@Named
@RequestScoped
public class PageBean implements Serializable{
	
	private String page;

	public String getPage() {
		return page;
	}

	public void setPage(String page) {
		this.page = page;
	}
	
	//Metodo responsavel por retornar a pagina necessaria
	public String goTo() {
		if("a".equals(page)) {
			return "pagea";
		}
		else if("b".equals(page)) {
			return "pageb";
		}
		else {
			return null;
		}
	}
}
