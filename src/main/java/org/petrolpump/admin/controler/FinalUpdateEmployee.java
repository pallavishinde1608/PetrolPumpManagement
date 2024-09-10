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
 * Servlet implementation class FinalUpdateEmployee
 */
@WebServlet("/FinalUpdemp")
public class FinalUpdateEmployee extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 response.setContentType("text/html");
		   
		    PrintWriter out=response.getWriter();
			int eid=Integer.parseInt(request.getParameter("eid"));
			String name=request.getParameter("name");
			String email=request.getParameter("email");
			String contact=request.getParameter("contact");
			String address=request.getParameter("address");
			int salary=Integer.parseInt(request.getParameter("salary"));
			EmployeeModel emodel=new EmployeeModel();
			emodel.setId(eid);
			emodel.setName(name);
			emodel.setEmail(email);
			emodel.setContact(contact);
			emodel.setAddress(address);
			emodel.setSal(salary);
			EmployeeService es=new EmployeeServiceIMPL();
			boolean b=es.isUpdateEmp(emodel);
			
			if(b)
			{
			RequestDispatcher r=request.getRequestDispatcher("ViewEmployee.jsp");
			r.forward(request, response);
			}
			else {
				out.println("<h1>Employee not updated.....</h1>");
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
