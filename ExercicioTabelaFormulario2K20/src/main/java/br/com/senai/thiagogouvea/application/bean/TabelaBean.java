package br.com.senai.thiagogouvea.application.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.faces.model.ListDataModel;
import javax.inject.Named;

import br.com.senai.thiagogouvea.application.model.Despesas;

@SuppressWarnings("serial")
@Named("tabela")
@SessionScoped
public class TabelaBean implements Serializable{
	private String data2;
	private String descricao2;
	private Double valor2;
	
	public String getData2() {
		return data2;
	}

	public void setData2(String data2) {
		this.data2 = data2;
	}

	public String getDescricao2() {
		return descricao2;
	}

	public void setDescricao2(String descricao2) {
		this.descricao2 = descricao2;
	}

	public Double getValor2() {
		return valor2;
	}

	public void setValor2(Double valor2) {
		this.valor2 = valor2;
	}

	private List<Despesas> despesas = new ArrayList<>();
	
	private Despesas despesa = new Despesas();
	
	public Despesas getDespesa() {
		return despesa;
	}

	public void setDespesa(Despesas despesa) {
		this.despesa = despesa;
	}

	public String inserir() {
		despesa.setData(data2);
		despesa.setDescricao(descricao2);
		despesa.setValor(valor2);
		
		despesas.add(despesa);
		despesa = new Despesas();
		return null;
	}
	
	public String excluir(Despesas despesa) {
		despesas.remove(despesa);
		return null;
	}
	
	public String editar(Despesas despesa) {
		despesa.setEdit(true);
		return null;
	}
	
	public List<Despesas> getDespesas() {
		return despesas;
	}
}
