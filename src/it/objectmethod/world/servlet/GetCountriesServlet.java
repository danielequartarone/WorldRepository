package it.objectmethod.world.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.http.HTTPException;

import it.objectmethod.world.model.dao.impl.CountryDao;
import it.objectmethod.world.model.domain.Country;

public class GetCountriesServlet extends HttpServlet{
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws HTTPException, IOException, ServletException{
		
		String continent = request.getParameter("thecontinent");
		request.getSession().setAttribute("continent", continent);
		CountryDao country = new CountryDao();
		List<Country> countries = country.getCountriesByContinent(continent);
		request.setAttribute("lista", countries);
		request.getRequestDispatcher("Country.jsp").forward(request, response);
	}
}
