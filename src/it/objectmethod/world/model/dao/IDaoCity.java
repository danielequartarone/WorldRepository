package it.objectmethod.world.model.dao;

import java.util.List;

import it.objectmethod.world.model.domain.City;


public interface IDaoCity {
	//questo non fa conflitto
	public List<City> getCitiesByCountry(String countryCode);
}
