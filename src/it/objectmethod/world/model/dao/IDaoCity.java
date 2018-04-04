package it.objectmethod.world.model.dao;

import java.util.List;

import it.objectmethod.world.model.domain.City;


public interface IDaoCity {
	public List<City> getCitiesByCountry(String countryCode);
}
