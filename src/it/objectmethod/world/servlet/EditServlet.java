package it.objectmethod.world.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.objectmethod.world.connection.ConnectionFactory;
import it.objectmethod.world.model.dao.impl.CityDao;
import it.objectmethod.world.model.dao.impl.CountryDao;
import it.objectmethod.world.model.domain.City;

public class EditServlet extends HttpServlet{

	@Override

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{

		int id = Integer.parseInt(request.getParameter("editThis"));
		List<String> countries = CountryDao.getAllCountries();
		
		if (id == 0) {
			City citta = new City();
			citta.setName("");
			
			
			
			request.setAttribute("countries", countries);
			request.setAttribute("citta", citta);
			request.getRequestDispatcher("InsertUpdate.jsp").forward(request, response);
		}
		else {
			CityDao ci = new CityDao();
			City citta = ci.getCityById(id);
			
			request.setAttribute("citta", citta);
			request.setAttribute("countries", countries);
			request.getRequestDispatcher("InsertUpdate.jsp").forward(request, response);
		}

	}
}
