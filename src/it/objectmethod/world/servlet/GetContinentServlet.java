package it.objectmethod.world.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.objectmethod.world.model.dao.impl.CountryDao;

public class GetContinentServlet extends HttpServlet{
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		CountryDao continents = new CountryDao();
		request.setAttribute("continent", continents.getContinentName());
		request.getRequestDispatcher("Continent.jsp").forward(request, response);
	}
}
