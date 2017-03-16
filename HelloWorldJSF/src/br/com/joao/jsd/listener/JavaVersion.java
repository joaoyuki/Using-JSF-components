package br.com.joao.jsd.listener;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.event.ValueChangeEvent;

@ManagedBean(name = "javaVersion", eager = true)
@SessionScoped
public class JavaVersion implements Serializable {

	private static final long serialVersionUID = 9585197520646828L;

	private static Map<String, String> versionData;
	private Map<String, String> versionData2;
	private String releaseDate = "January 23, 1996";

	static {
		versionData = new LinkedHashMap<String, String>();
		versionData.put("JDK 1.0", "January 23, 1996");
		versionData.put("JDK 1.1", "February 19, 1997");
		versionData.put("J2SE 1.2", "December 8, 1998");
		versionData.put("J2SE 1.3", "May 8, 2000");
		versionData.put("J2SE 1.4", "February 6, 2002");
		versionData.put("J2SE 5.0", "September 30, 2004");
		versionData.put("Java SE 6", "December 11, 2006");
		versionData.put("Java SE 7", "July 28, 2011");
		versionData.put("Java SE 8", "March 18, 2014");
	}

	public Map<String, String> getVersionData() {
		return versionData;
	}

	public void setVersionData(Map<String, String> versionData) {
		JavaVersion.versionData = versionData;
	}

	public String getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}
	
	public void versionChanged(ValueChangeEvent changeEvent){
		
		releaseDate = changeEvent.getNewValue().toString();
		
	}

	public Map<String, String> getVersionData2() {
		return versionData2;
	}

	public void setVersionData2(Map<String, String> versionData2) {
		this.versionData2 = versionData2;
	}
	
}
