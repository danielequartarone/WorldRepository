package it.objectmethod.world.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.objectmethod.world.connection.ConnectionFactory;
import it.objectmethod.world.model.dao.IDaoCity;
import it.objectmethod.world.model.dao.IDaoCountry;
import it.objectmethod.world.model.dao.impl.CityDao;
import it.objectmethod.world.model.dao.impl.CountryDao;
import it.objectmethod.world.model.domain.City;
import it.objectmethod.world.model.domain.Country;

public class EditServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{

		int id = Integer.parseInt(request.getParameter("editThis"));

		
		IDaoCountry daoCountry = new CountryDao();
		IDaoCity daoCity = new CityDao();
		
		List<Country> countries = daoCountry.getAllCountries();
		City citta = new City();
		
		if (id > 0) {
			citta = daoCity.getCityById(id); 	 
		}

		request.setAttribute("citta", citta);
		request.setAttribute("countries", countries);
		request.getRequestDispatcher("InsertUpdate.jsp").forward(request, response);

	}
}
