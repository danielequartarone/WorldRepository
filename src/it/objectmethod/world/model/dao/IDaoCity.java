package it.objectmethod.world.model.dao;


import java.util.List;

import it.objectmethod.world.model.domain.City;


public interface IDaoCity {
	public List<City> getCitiesByCountry(String countryCode);
	public City getCityById(int id);
	public void delCityByID(int id);
	public int updateCity(String nome, String code, int population, int id);
	public int insertCity(String nome, String code, int population);
}
