package it.objectmethod.world.model.domain;

public class City {
	
	private String name, code; //TODO refactoring code in countryCode
	private String population;
	private int id;
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	
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
	

}
