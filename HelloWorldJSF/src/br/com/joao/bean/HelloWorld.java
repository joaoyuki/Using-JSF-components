package br.com.joao.bean;

import java.util.Random;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

@ManagedBean(name = "helloBean")
@SessionScoped
public class HelloWorld {

	@PostConstruct
	public void teste(){
		
	}
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	//Método que vai ser chamado pela nossa requisição AJAX
	public String getSayWelcome(){
		if ("".equals(name) || name == null){
			return "";
		} else {
			return "Ajax message: Welcome: " + name;
		}
		
	}
	
}
