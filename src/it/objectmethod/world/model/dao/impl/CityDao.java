package it.objectmethod.world.model.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.util.ArrayList;
import java.util.List;

import it.objectmethod.world.connection.ConnectionFactory;
import it.objectmethod.world.model.dao.IDaoCity;
import it.objectmethod.world.model.domain.City;

public class CityDao implements IDaoCity {


	public List<City> getCitiesByCountry(String countryCode) {
		
		List<City> cities = new ArrayList<City>();
		
		try {

			Connection conn= ConnectionFactory.getConnection();

			String sql = "select ci.Name name, ci.countrycode as code, ci.population as population, ci.id as id " + 
					"from city ci " + 
					"join country co " + 
					"on ci.CountryCode = co.Code " + 
					"where co.Code = ?";						
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, countryCode);
			ResultSet rs = ps.executeQuery();

			while(rs.next()) {
				City cb = new City();
				cb.setName(rs.getString("name"));
				cb.setCountryCode(rs.getString("code"));
				cb.setPopulation(rs.getString("population"));
				cb.setId(rs.getInt("id"));
				cities.add(cb);
			}
			
			rs.close();
			ps.close();
			conn.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return cities;
	}


	public City getCityById(int id) {
		City citta=new City();
		try {
			Connection conn= ConnectionFactory.getConnection();

			String sql = "select * from city where city.id = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			String help = ""+id;
			ps.setString(1, help);

			ResultSet rs = ps.executeQuery();

			while(rs.next()) {
				citta.setName(rs.getString("Name"));
				citta.setId(id);
				citta.setCountryCode(rs.getString("CountryCode"));
				citta.setPopulation(rs.getString("Population"));
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return citta;

	}

	public void delCityByID(int id) {
		
		
		try {
			Connection conn= ConnectionFactory.getConnection();
			String sql = "DELETE FROM city WHERE city.id = ?";

			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, id);
			
			ps.executeUpdate();
			
			ps.close();
			conn.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

	public int updateCity(String nome, String code, int population, int id) {
		
		int risultato=0;
		
		try {
			
			Connection conn= ConnectionFactory.getConnection();
			String sql = "UPDATE City set Name = ?, Population = ? , CountryCode = ? WHERE city.id = ?";
 
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, nome);
			ps.setString(3, code.toUpperCase());
			ps.setInt(2, population);
			ps.setInt(4, id);
			risultato=ps.executeUpdate();

			ps.close();
			conn.close();

		}catch(Exception e) {
			e.printStackTrace();
		}

		return risultato;
	}

	public int insertCity(String nome, String code, int population) {
		
		int risultato = 0;
		
		try {

			Connection conn= ConnectionFactory.getConnection();
			String sql = "INSERT INTO city(City.name, city.countrycode, city.population) VALUES (?, ?, ?)";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, nome);
			ps.setString(2, code);
			ps.setInt(3, population);
			risultato=ps.executeUpdate();

			ps.close();
			conn.close();

		}catch(Exception e) {
			e.printStackTrace();
		}

		return risultato;

	}

}
