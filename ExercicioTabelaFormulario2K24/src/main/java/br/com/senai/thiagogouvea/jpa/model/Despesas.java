package br.com.senai.thiagogouvea.jpa.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Despesas {
	
	@Id
	@GeneratedValue
	private Integer id;
	
	private String data;
	private String descricao;
	private Double valor;
	private Boolean edit;
	
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	public Boolean getEdit() {
		return edit;
	}
	public void setEdit(Boolean edit) {
		this.edit = edit;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	public Despesas(String data, String descricao, Double valor) {
		this.data = data;
		this.descricao = descricao;
		this.valor = valor;
	}

	public Despesas() {
		this.data = data;
		this.descricao = descricao;
		this.valor = valor;
	}
}