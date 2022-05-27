package br.com.senai.thiagogouvea.jpa.ejbbean;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.com.senai.thiagogouvea.jpa.model.Despesas;

@Stateless
public class DespesaBean {
	@PersistenceContext
	private EntityManager em;
	
	public void inserir(Despesas despesas) {
		em.persist(despesas);
	}
	
	public void atualizar(Despesas despesas) {
		em.merge(despesas);
	}
	
	public void excluir(Despesas despesas) {
		despesas = carregar(despesas.getId());
		em.remove(despesas);
	}
	
	public Despesas carregar(int id) {
		return em.find(Despesas.class, id);
	}
}
