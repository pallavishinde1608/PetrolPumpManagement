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
import org.petrolpump.admin.service.*;

/**
 * Servlet implementation class UpdateFuelType
 */
@WebServlet("/updFuel")
public class UpdateFuelType extends HttpServlet {
	
	protected void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		int typeid=Integer.parseInt(request.getParameter("typeid"));
		String  type=request.getParameter("type");
//		out.println("<h1>Machine id is "+typeid+"</h1>");
//		out.println("<h1>Machine code is "+type+"</h1>");
		RequestDispatcher r=request.getRequestDispatcher("AdminDashBoard.jsp");
		r.include(request,response);
		out.println("<link href='CSS/UpdateFuel.css' rel='stylesheet'>");
		out.println("<div class='col-md-8'>");
		out.println(" <form class='formfuel' name='frm' action='FinalUpd' method='Post'>");
		out.println("<h1>Update Fuel</h1>");
		out.println("<input type='hidden' value='"+typeid+"' class='form-control c' name='typeid' id='typeid'><br>");
		out.println("<input type='text' value='"+type+"' class='form-control c' name='type' id='type' placeholder='Enter Fuel Type'><br>");
		out.println("<button type='submit' name='s' class='btn'>Add Fuel Type</button>");
		out.println("</div></div></div>");	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
