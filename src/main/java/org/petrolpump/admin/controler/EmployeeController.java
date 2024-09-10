package org.petrolpump.admin.controler;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.petrolpump.admin.model.EmployeeModel;
import org.petrolpump.admin.service.*;
/**
 * Servlet implementation class EmployeeController
 */
@WebServlet("/EmpCont")
public class EmployeeController extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	  response.setContentType("text/html");
	  PrintWriter out=response.getWriter();
	  String name=request.getParameter("name");
	  String email=request.getParameter("email");
	  String contact=request.getParameter("contact");
	  String address=request.getParameter("address");
	  int sal=Integer.parseInt(request.getParameter("salary"));
	  EmployeeModel emodel=new EmployeeModel();
	  emodel.setName(name);
	  emodel.setEmail(email);
	  emodel.setContact(contact);
	  emodel.setAddress(address);
	  emodel.setSal(sal);
	  EmployeeService es=new EmployeeServiceIMPL();
	  
	  boolean b=es.isAddEmployee(emodel);
	  if(b)
	  {
//		  RequestDispatcher r=request.getRequestDispatcher("AdminDashBoard.jsp");
//		  r.include(request, response);
		  out.println("<h1>Employee Added.......</h1>");
	  }
	
	  else {
//		  RequestDispatcher r=request.getRequestDispatcher("AdminDashBoard.jsp");
//			r.forward(request, response);
		  out.println("<h1>Employee not addeed.....</h1>");
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
