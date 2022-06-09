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
	//Criando a lista de despesas
	private List<Despesas> despesas = new ArrayList<>();
	
	//Metodo responsavel por inserir novas despesas na lista
	public String inserir() {
		Despesas d = new Despesas();
		despesas.add(d);
		d.setEdit(true);
		return null;
	}
	
	//Metodo responsavel por excluir as despesas da lista
	public String excluir(Despesas despesa) {
		despesas.remove(despesa);
		return null;
	}
	
	//Metodo responsavel por editar os dados que estão na lista
	public String editar(Despesas despesa) {
		despesa.setEdit(true);
		return null;
	}
	
	//Metodo responsavel por gravar as novas informações da tabela
	public String gravar(Despesas despesa) {
		despesa.setEdit(false);
		return null;
	}
	
	//Metodo responsavel por retornar a lista de despesas
	public List<Despesas> getDespesas() {
		return despesas;
	}
}
