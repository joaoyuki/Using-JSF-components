package br.com.joao.jsd.listener;

import javax.faces.context.FacesContext;
import javax.faces.event.AbortProcessingException;
import javax.faces.event.ValueChangeEvent;
import javax.faces.event.ValueChangeListener;

//We created this listener to use on taglistener.xhtml
public class VersionChangeListener implements ValueChangeListener{

	@Override
	public void processValueChange(ValueChangeEvent event) throws AbortProcessingException {

		System.out.println("Enter processValue change");
		JavaVersion javaVersion = (JavaVersion) FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("javaVersion");
		javaVersion.setReleaseDate(event.getNewValue().toString());
		System.out.println("Exit processValue change");
	}

}
