package br.com.rafaelcosta.application.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

//Essa anotação cria a tabela cliente no banco de dados
@Entity
public class Cliente implements Serializable {
	
	//Essas duas anotações atribuem um id a cada cliente automaticamente a cada cliente cadastrado
	@Id
	@GeneratedValue
	private Integer id;
	
	//Essa anotação cria uma coluna na tabela cliente conforme as especificações juntas a ela
	@Column(length = 100, nullable = false)
	private String nome;
	
	@Column(length = 50, nullable = false)
	private String email;

	//Essa anotação é responsavel por determinar a cardinalidade entre duas tabelas
	@OneToMany(mappedBy = "cliente")
	private List<Pedido> pedidos;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Pedido> getPedidos() {
		return pedidos;
	}

	public void setPedidos(List<Pedido> pedidos) {
		this.pedidos = pedidos;
	}

	//Essa anotação é responsavel por sobrescrever o metodo
	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nome=" + nome + ", email=" + email + "]";
	}
}

