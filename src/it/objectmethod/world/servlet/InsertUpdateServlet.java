package it.objectmethod.world.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.objectmethod.world.model.dao.impl.CityDao;

public class InsertUpdateServlet extends HttpServlet{

	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		
		String idstring=request.getParameter("id");
		String name = request.getParameter("citta");
		String code = request.getParameter("code");	
		String popolazione = request.getParameter("popolazione");
		int population=0;
		if(popolazione!=null) {
			population = Integer.parseInt(popolazione);
		}
		
		int id = Integer.parseInt(idstring);
		
		CityDao city = new CityDao();
		
		if(id>0) {
			city.updateCity(name, code, population, id); //TODO check se davvero effettuo update o insert, ps.executeUpdate ritorna int
		}
		else {
			city.insertCity(name, code, population);
		}
		
		String datiSalvati = "Dati salvati correttamente";
		request.setAttribute("stringaSalvataggio", datiSalvati);
		request.getRequestDispatcher("cities?thecountry=" + code).forward(request, response);
	}
}
