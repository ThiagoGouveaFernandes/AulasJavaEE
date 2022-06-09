package br.com.rafaelcosta.application.ejb;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.com.rafaelcosta.application.model.Cliente;

//Essa anotação determina o tempo de vida do EJB
@Stateless 
public class ClienteBean {

	//Essa anotação armazena as entidades que estão sendo criadas e gerenciadas
	@PersistenceContext
	private EntityManager em;
	
	public List<Cliente> listar() {
		return em.createQuery("SELECT c FROM Cliente c", Cliente.class).getResultList();
	}
}
