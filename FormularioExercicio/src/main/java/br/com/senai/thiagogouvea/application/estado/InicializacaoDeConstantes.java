package br.com.senai.thiagogouvea.application.estado;


import java.util.ArrayList;
import java.util.List;

import br.com.senai.thiagogouvea.application.model.Estado;
import br.com.senai.thiagogouvea.application.model.Interesse;

public class InicializacaoDeConstantes {
	
	public static final List<Estado> ESTADOS;
	public static final List<Interesse> INTERESSES;
	
	static {
		ESTADOS = new ArrayList<>();
		
		//Adicionando novos objetos na lista de estados
		ESTADOS.add(new Estado("AC", "Acre"));
		ESTADOS.add(new Estado("AL", "Alagoas"));
		ESTADOS.add(new Estado("AP", "Amapá"));
		ESTADOS.add(new Estado("AM", "Amazonas"));
		ESTADOS.add(new Estado("BA", "Bahia"));
		ESTADOS.add(new Estado("CE", "Ceará"));
		ESTADOS.add(new Estado("DF", "Distrito Federal"));
		ESTADOS.add(new Estado("ES", "Espirito Santo"));
		ESTADOS.add(new Estado("GO", "Goiás"));
		ESTADOS.add(new Estado("MA", "Maranhão"));
		ESTADOS.add(new Estado("MT", "Mato Grosso"));
		ESTADOS.add(new Estado("MS", "Mato Grosso do Sul"));
		ESTADOS.add(new Estado("MG", "Minas Gerais"));
		ESTADOS.add(new Estado("PA", "Pará"));
		ESTADOS.add(new Estado("PB", "Paraíba"));
		ESTADOS.add(new Estado("PR", "Paraná"));
		ESTADOS.add(new Estado("PE", "Pernanbuco"));
		ESTADOS.add(new Estado("PI", "Piauí"));
		ESTADOS.add(new Estado("RJ", "Rio de Janeiro"));
		ESTADOS.add(new Estado("RN", "Rio Grande do Norte"));
		ESTADOS.add(new Estado("RS", "Rio Grande do Sul"));
		ESTADOS.add(new Estado("RO", "Rondônia"));
		ESTADOS.add(new Estado("RR", "Roraima"));
		ESTADOS.add(new Estado("SC", "Santa Catarina"));
		ESTADOS.add(new Estado("SP", "São Paulo"));
		ESTADOS.add(new Estado("SE", "Sergipe"));
		ESTADOS.add(new Estado("TO", "Tocantins"));
		
		INTERESSES = new ArrayList<>();
		
		INTERESSES.add(new Interesse(1, "Esportes"));
		INTERESSES.add(new Interesse(2, "Música"));
		INTERESSES.add(new Interesse(3, "Artes Marciais"));
		INTERESSES.add(new Interesse(4, "Viagens"));
		INTERESSES.add(new Interesse(5, "Cinema"));
		INTERESSES.add(new Interesse(6, "Dança"));
	}
}
