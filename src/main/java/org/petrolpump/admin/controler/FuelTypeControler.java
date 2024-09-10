package org.petrolpump.admin.controler;

import java.io.IOException;
import java.io.*;
import org.petrolpump.admin.service.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.petrolpump.admin.model.FuelTypeModel;


@WebServlet("/newFuel")
public class FuelTypeControler extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	response.setContentType("text/html");
	PrintWriter out=response.getWriter();
	String fuelType=request.getParameter("FuelType");
	FuelTypeModel fmodel=new FuelTypeModel();
	fmodel.setName(fuelType);
	FuelService fs=new FuelServiceIMPL();
	boolean b=fs.isAddFuelModel(fmodel);
	if(b)
	{
//		RequestDispatcher r=request.getRequestDispatcher("AdminDashBoard.jsp");
//		r.include(request, response);
		out.println("<h1>fuel type added successfully......</h1>");
		
	}
	else {
//		RequestDispatcher r=request.getRequestDispatcher("AdminDashBoard.jsp");
//		r.include(request, response);
		out.println("<h1>fuel type not added successfully......</h1>");
		
	}	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
