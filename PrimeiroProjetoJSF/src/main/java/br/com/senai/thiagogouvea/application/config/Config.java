package br.com.senai.thiagogouvea.application.config;

import javax.enterprise.context.ApplicationScoped;
import javax.faces.annotation.FacesConfig;
import javax.faces.annotation.FacesConfig.Version;

//Força ao JSF usar esta versão em especifico
@FacesConfig(version = Version.JSF_2_3)
//Permite que essa classe funcione enquanto o servidor estiver funcionando
@ApplicationScoped
public class Config {

}
