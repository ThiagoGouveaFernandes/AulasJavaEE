package br.com.senai.thiagogouvea.model;

public class numAleatorios {
	private Integer qtdNumeros;
	
	public static final numAleatorios[] NUMALEATORIOS;
	
	static {
		NUMALEATORIOS = new numAleatorios[5];
		
		NUMALEATORIOS[0] = new numAleatorios(1);
		NUMALEATORIOS[1] = new numAleatorios(2);
		NUMALEATORIOS[2] = new numAleatorios(3);
		NUMALEATORIOS[3] = new numAleatorios(4);
		NUMALEATORIOS[4] = new numAleatorios(5);
	}

	public numAleatorios(Integer qtdAleatorios) {
		this.qtdNumeros = qtdNumeros;
	}

	public Integer getQtdNumeros() {
		return qtdNumeros;
	}

	public void setQtdNumeros(Integer qtdNumeros) {
		this.qtdNumeros = qtdNumeros;
	}
	
}
