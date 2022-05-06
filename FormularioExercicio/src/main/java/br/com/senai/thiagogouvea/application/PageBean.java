package br.com.senai.thiagogouvea.application;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import br.com.senai.thiagogouvea.application.estado.InicializacaoDeConstantes;
import br.com.senai.thiagogouvea.application.model.Endereco;
import br.com.senai.thiagogouvea.application.model.Estado;
import br.com.senai.thiagogouvea.application.model.Interesse;
import br.com.senai.thiagogouvea.application.model.Pessoa;
import br.com.senai.thiagogouvea.application.model.Telefone;

@SuppressWarnings("serial")
@Named
@SessionScoped
public class PageBean implements Serializable {
	private Pessoa pessoa;
	
	public Pessoa getPessoa() {
		if(pessoa == null) {
			pessoa = new Pessoa();
			pessoa.setEnderecoResidencial(new Endereco());
			pessoa.getEnderecoResidencial().setEstado(new Estado());
			pessoa.setEnderecoComercial(new Endereco());
			pessoa.getEnderecoComercial().setEstado(new Estado());
			pessoa.setTelefoneResidencial(new Telefone());
			pessoa.setTelefoneCelular(new Telefone());
			pessoa.setTelefoneComercial(new Telefone());
		}
		
		return pessoa;
	}
	
	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	
	public List<Estado> getEstados(){
		return InicializacaoDeConstantes.ESTADOS;
	}
	
	public List<Interesse> getInteresse(){
		return InicializacaoDeConstantes.INTERESSES;
	}
}