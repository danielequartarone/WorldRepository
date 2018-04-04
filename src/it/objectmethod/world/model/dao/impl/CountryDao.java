package it.objectmethod.world.model.dao.impl;

import java.util.ArrayList;
import java.util.List;
import java.sql.*;


import it.objectmethod.world.connection.ConnectionFactory;
import it.objectmethod.world.model.dao.IDaoCountry;
import it.objectmethod.world.model.domain.Country;

public class CountryDao implements IDaoCountry{
	
	public List<Country> getCountriesByContinent(String continentName){
		List<Country> countries = new ArrayList<>();
		try {
			Connection conn= ConnectionFactory.getConnection();
			
			String sql = "Select * FROM country WHERE country.continent = ?";						
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, continentName);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				Country cb = new Country();
				cb.setName(rs.getString("Name"));
				cb.setCode(rs.getString("Code"));
				cb.setContinent(rs.getString("Continent"));
				countries.add(cb);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return countries;
	}

	public List<String> getContinentName() {
		List<String> continents = new ArrayList<String>();
		try {
			Connection conn= ConnectionFactory.getConnection();
			String sql = "Select distinct country.continent as Continent FROM country";						
			Statement state = conn.createStatement();
			ResultSet rs = state.executeQuery(sql);
			
			while(rs.next()) {
				String continente =rs.getString("Continent");
				continents.add(continente);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return continents;
	}
	
	public static List<String> getAllCountries(){
		List<String> countries = new ArrayList<>();
		try {
			Connection conn= ConnectionFactory.getConnection();
			String sql = "Select country.code FROM country";						
			Statement state = conn.createStatement();
			ResultSet rs = state.executeQuery(sql);
			
			while(rs.next()) {
				String continente =rs.getString("Code");
				countries.add(continente);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return countries;
		
	}

}
