package it.objectmethod.world.model.domain;

public class City {
	
	private String name, countryCode; 
	private String population;
	private int id;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getPopulation() {
		return population;
	}
	
	public void setPopulation(String population) {
		this.population = population;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	

}
