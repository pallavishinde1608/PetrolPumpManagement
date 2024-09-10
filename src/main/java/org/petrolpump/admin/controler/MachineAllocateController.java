package org.petrolpump.admin.controler;

import java.io.IOException;
import java.io.PrintWriter;
import org.petrolpump.admin.service.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MachineAllocateController
 */
@WebServlet("/FinalMachineAllocate")
public class MachineAllocateController extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		int empid=Integer.parseInt(request.getParameter("empid"));
		int mid=Integer.parseInt(request.getParameter("mid"));
		String startTime=request.getParameter("startTime");
		String endTime=request.getParameter("endTime");
		String AllDate=request.getParameter("AllDate");
		EmployeeService es=new EmployeeServiceIMPL();
		boolean b=es.allocateMachine(empid, mid, startTime,endTime,AllDate);
	    if(b)
	    {
	    	out.println("<h1>Machine Allocated .......</h1>");
	    }
	    else {
	    	out.println("<h1>Machine Not Allocated......</h1>");
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
