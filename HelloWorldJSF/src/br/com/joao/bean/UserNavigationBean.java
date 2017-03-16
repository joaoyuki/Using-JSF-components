package br.com.joao.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "userNav")
@SessionScoped
public class UserNavigationBean {

	public String submit(){
		
		//The "success" rule is difined in faces-config.xml file.
		return "success";
		
	}
	
}
