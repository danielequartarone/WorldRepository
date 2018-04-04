package it.objectmethod.world.model.dao;

import java.util.List;

import it.objectmethod.world.model.domain.Country;

public interface IDaoCountry {
	public List<String> getContinentName();
	public List<Country> getCountriesByContinent(String continentName);
	public List<Country> getAllCountries();
	
}
