package br.com.joao.bean;

import java.io.Serializable;
import java.util.Map;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

@ManagedBean(name = "userBean")
@SessionScoped
public class UserBean implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private String userName;
	private String password;
	private String address;
	private String hiddenMessage = "Hi from hidden value";
	private String country;
	
	private String getCountryFromJSF(FacesContext context){
		
		Map<String, String> parameters = context.getExternalContext().getRequestParameterMap();
		
		return parameters.get("country");
		
	}
	
	public String outcome(){
		
		FacesContext context = FacesContext.getCurrentInstance();
		this.country = getCountryFromJSF(context);
		
		return "paramExampleResponse";
	}
	
	public String actionListernerExample(ActionEvent event){
		
		password = (String) event.getComponent().getAttributes().get("password");
		
		return "paramExampleResponse";//Even with the return, this will not forward to another page
		
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getHiddenMessage() {
		return hiddenMessage;
	}

	public void setHiddenMessage(String hiddenMessage) {
		this.hiddenMessage = hiddenMessage;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

}
