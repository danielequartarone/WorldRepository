package it.objectmethod.world.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.objectmethod.world.model.dao.impl.CityDao;
import it.objectmethod.world.model.domain.City;

public class DelCityServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		int id = Integer.parseInt(request.getParameter("id"));
		String code = request.getParameter("code");
		CityDao cityD = new CityDao();
		cityD.delCityByID(id);
		request.getRequestDispatcher("cities?thecountry=" + code).forward(request, response);	
	
	}
}
