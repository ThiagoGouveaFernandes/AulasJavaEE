package br.com.rafaelcosta.application.bean;


import java.io.Serializable;
import java.text.NumberFormat;
import java.util.Locale;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

@Named
@ApplicationScoped
public class FormatterBean implements Serializable {

	//O Locale entrega para nós o lugar e sua lingua
	private static final Locale LOCALE_BR = new Locale("pt", "BR");
	
	public String formatarMoeda(double valor) {
		//NumberFormat transforma o valor na modeda do local especificado do locale
		NumberFormat nf = NumberFormat.getCurrencyInstance(LOCALE_BR);
		return nf.format(valor);
	}
}
