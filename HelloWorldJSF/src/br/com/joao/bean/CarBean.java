package br.com.joao.bean;

import java.io.Serializable;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "carBean")
@SessionScoped
public class CarBean implements Serializable{

	private static final long serialVersionUID = 5947384068681414422L;
	
	private String favoriteCar1;
	private String favoriteCar2;
	private String favoriteCar3;
	private String[] favoriteCar4;
	private String[] favoriteCar5;
	private String[] favoriteCar6;
	
	public String getFavoriteCar1() {
		return favoriteCar1;
	}
	
	public void setFavoriteCar1(String favoriteCar1) {
		this.favoriteCar1 = favoriteCar1;
	}
	
	public String getFavoriteCar2() {
		return favoriteCar2;
	}
	
	public void setFavoriteCar2(String favoriteCar2) {
		this.favoriteCar2 = favoriteCar2;
	}
	
	public String getFavoriteCar3() {
		return favoriteCar3;
	}
	
	public void setFavoriteCar3(String favoriteCar3) {
		this.favoriteCar3 = favoriteCar3;
	}
	
	//generatedByMap -----------------------------------------------
	private static Map<String, Object> car2value;
	static{
		car2value = new LinkedHashMap<String, Object>();
		car2value.put("BMW 335", "335");//label and value
		car2value.put("BMW316", "316");//label and value
		car2value.put("BMW M3 SMG", "M3 SMG");//label and value
	}
	public Map<String, Object> getFavoriteCar2Value() {
		return car2value;
	}

	public static void setCar2value(Map<String, Object> car2value) {
		CarBean.car2value = car2value;
	}
	//------------------------------------------------------------------------
	
	//generated by object array ----------------------------------------------
	public static class Car{
		
		public String carLabel;
		public String carValue;
		
		public Car(String carLabel, String carValue){
			this.carLabel = carLabel;
			this.carValue = carValue;
		}
		
		
		public String getCarLabel() {
			return carLabel;
		}
		public void setCarLabel(String carLabel) {
			this.carLabel = carLabel;
		}
		public String getCarValue() {
			return carValue;
		}
		public void setCarValue(String carValue) {
			this.carValue = carValue;
		}
		
	}
	//----------------------------------------------------------------
	
	public Car[] car3List;
	public Car[] getFavoritedCar3value(){
		
		car3List = new Car[3];
		
		car3List[0] = new Car("BMW 335", "335");
		car3List[1] = new Car("BMW316", "316");
		car3List[2] = new Car("BMW M3 SMG", "M3 SMG");
		
		return car3List;
		
	}

	public String[] getFavoriteCar4() {
		return favoriteCar4;
	}
	
	public String getFavoriteCar4InString(){
		return Arrays.toString(favoriteCar4);
	}

	public void setFavoriteCar4(String[] favoriteCar4) {
		this.favoriteCar4 = favoriteCar4;
	}

	public String[] getFavoriteCar5() {
		
		favoriteCar5 = new String[5];
		favoriteCar5[0] = "116";
		favoriteCar5[1] = "118";
		favoriteCar5[2] = "X1";
		favoriteCar5[3] = "Series 1 Coupe";
		favoriteCar5[4] = "120";
		
		return favoriteCar5;
	}
	
	public String getFavoriteCar5InString(){
		return Arrays.toString(favoriteCar5);
	}

	public void setFavoriteCar5(String[] favoriteCar5) {
		this.favoriteCar5 = favoriteCar5;
	}

	public String[] getFavoriteCar6() {
		favoriteCar6 = new String[5];
		favoriteCar6[0] = "116";
		favoriteCar6[1] = "118";
		favoriteCar6[2] = "X1";
		favoriteCar6[3] = "Series 1 Coupe";
		favoriteCar6[4] = "120";
		
		return favoriteCar6;
	}
	
	public String getFavoriteCar6InString(){
		return Arrays.toString(favoriteCar6);
	}

	public void setFavoriteCar6(String[] favoriteCar6) {
		this.favoriteCar6 = favoriteCar6;
	}

}
