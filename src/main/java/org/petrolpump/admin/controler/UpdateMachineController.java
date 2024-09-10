package org.petrolpump.admin.controler;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.petrolpump.admin.model.MachineModel;
import org.petrolpump.admin.service.MachineService;
import org.petrolpump.admin.service.MachineServiceIMPL;


@WebServlet("/updMachine")
public class UpdateMachineController extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	response.setContentType("text/html");
	PrintWriter out=response.getWriter();
	int mid=Integer.parseInt(request.getParameter("mid"));
	String  machineCode=request.getParameter("mcode");
//	out.println("<h1>Machine id is "+mid+"</h1>");
//	out.println("<h1>Machine code is "+machineCode+"</h1>");
	RequestDispatcher r=request.getRequestDispatcher("AdminDashBoard.jsp");
	r.include(request, response);
	out.println("<link href='CSS/MachineUpdate.css' rel='stylesheet'>");
	out.println("<div class='col-md-8'>");
	out.println("<form class='formupdate' name='frm' action='FinalUpdate' method='Post'>");
	out.println("<h1>Update Machine</h1><br><br>");
	out.println("<input type='hidden' name='mid' value='"+mid+"' class='control'/>");
	out.println("<input type='text' name='mcode' value='"+machineCode+"' class='control'/><br><br>");
	out.println("<button type='submit' name='s' class='buton'>Update Machine</button>");
	out.println("</div></div></div>");
	
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
