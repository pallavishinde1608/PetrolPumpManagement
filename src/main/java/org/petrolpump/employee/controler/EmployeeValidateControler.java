package org.petrolpump.employee.controler;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.petrolpump.admin.service.*;
/**
 * Servlet implementation class EmployeeValidateControler
 */
@WebServlet("/validate")
public class EmployeeValidateControler extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	  response.setContentType("text/html");
	  PrintWriter out=response.getWriter();
	  String email=request.getParameter("email");
	  String contact=request.getParameter("contact");
	  EmployeeService es=new EmployeeServiceIMPL();
	  int result=es.verifyEmployee(email,contact);
	  if(result!=0){
		  HttpSession session=request.getSession(true);
		  session.setAttribute("empId",result);
		  RequestDispatcher r=request.getRequestDispatcher("EmployeeDashBoard.jsp");
		  r.forward(request,response);
//		  out.println("<h1>Employee Login.....</h1>");
	  }
	  else {
		  out.println("<h1>Invalid employee login......</h1>");
	  }
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
