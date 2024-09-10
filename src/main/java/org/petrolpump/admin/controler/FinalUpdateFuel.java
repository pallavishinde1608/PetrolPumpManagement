package org.petrolpump.admin.controler;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.petrolpump.admin.model.FuelTypeModel;
import org.petrolpump.admin.service.FuelService;
import org.petrolpump.admin.service.FuelServiceIMPL;

/**
 * Servlet implementation class FinalUpdateFuel
 */
@WebServlet("/FinalUpd")
public class FinalUpdateFuel extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		    response.setContentType("text/html");
		   
		    PrintWriter out=response.getWriter();
			int typeid=Integer.parseInt(request.getParameter("typeid"));
			String type=request.getParameter("type");
			FuelTypeModel fmodel=new FuelTypeModel();
			fmodel.setId(typeid);
			fmodel.setName(type);
			FuelService fs=new FuelServiceIMPL();
			boolean b=fs.isUpdateFuel(fmodel);
			
			if(b)
			{
			RequestDispatcher r=request.getRequestDispatcher("ViewFuelType.jsp");
			r.forward(request, response);
			}
			else {
				out.println("<h1>Fuel not updated.....</h1>");
			}

	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
