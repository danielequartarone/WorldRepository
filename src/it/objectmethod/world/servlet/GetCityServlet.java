package it.objectmethod.world.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.http.HTTPException;

import it.objectmethod.world.model.dao.impl.CityDao;
import it.objectmethod.world.model.domain.City;

public class GetCityServlet extends HttpServlet{

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws HTTPException, IOException, ServletException{

		String country = request.getParameter("thecountry");
		CityDao city = new CityDao();
		List<City> cities = city.getCitiesByCountry(country);
		request.setAttribute("cities", cities);
		request.getRequestDispatcher("City.jsp").forward(request, response);
	}
}
