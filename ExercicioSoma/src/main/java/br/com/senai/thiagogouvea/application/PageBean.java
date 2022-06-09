package br.com.senai.thiagogouvea.application;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.faces.context.Flash;
import javax.inject.Inject;
import javax.inject.Named;

//Essa anotação nos possibilita determinar como chamaremos essa classe em outras classes ou arquivos xhtml
@Named
//Essa anotação permite que essa classe continue funcionando enquanto estiver sendo requisitada
@RequestScoped
public class PageBean implements Serializable{
	//declarando variaveis privados
	private double valor1;
	private double valor2;
	private double valor3;
	
	//Esse metodos getters e seters são responsaveis por pegar certo valor de uma variavel privada ou atribuir algum valor a ela
	public double getValor1() {
		return valor1;
	}

	public void setValor1(double valor1) {
		this.valor1 = valor1;
	}

	public double getValor2() {
		return valor2;
	}

	public void setValor2(double valor2) {
		this.valor2 = valor2;
	}

	public double getValor3() {
		return valor3;
	}

	public void setValor3(double valor3) {
		this.valor3 = valor3;
	}
	
	//Essa notação injeta codigos no java
	@Inject
	private Flash flash;
	
	//É metodo de soma que utiliza recursos do flash
	public String calcular() {
		flash.put("resultado", (valor1 + valor2 + valor3));
		
		return "result";
	}
}
