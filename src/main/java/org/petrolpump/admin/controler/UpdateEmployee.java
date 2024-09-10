package org.petrolpump.admin.controler;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UpdateEmployee
 */
@WebServlet("/updemp")
public class UpdateEmployee extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		int eid=Integer.parseInt(request.getParameter("eid"));
		String  name=request.getParameter("name");
		String email=request.getParameter("email");
		String contact=request.getParameter("contact");
		String address=request.getParameter("address");
		int salary=Integer.parseInt(request.getParameter("salary"));
//		out.println("<h1>Machine id is "+typeid+"</h1>");
//		out.println("<h1>Machine code is "+type+"</h1>");
		RequestDispatcher r=request.getRequestDispatcher("AdminDashBoard.jsp");
		r.include(request, response);
		out.println("<link href='CSS/UpdateFuel.css' rel='stylesheet'>");
		out.println("<div class='col-md-8'>");
		out.println(" <form class='formfuel' name='frm' action='FinalUpdemp' method='Post'>");
		out.println("<h1>Update Fuel</h1>");
		out.println("<input type='hidden' value='"+eid+"' class='form-control c' name='eid' id='typeid'><br>");
		out.println("<input type='text' value='"+name+"' class='form-control c' name='name' id='type' placeholder='Enter employee name'><br>");
		out.println("<input type='text' value='"+email+"' class='form-control c' name='email' id='type' placeholder='Enter employee email'><br>");
		out.println("<input type='text' value='"+contact+"' class='form-control c' name='contact' id='type' placeholder='Enter employee contact'><br>");
		out.println("<input type='text' value='"+address+"' class='form-control c' name='address' id='type' placeholder='Enter employee address'><br>");
		out.println("<input type='text' value='"+salary+"' class='form-control c' name='salary' id='type' placeholder='Enter employee salary'><br>");
		out.println("<button type='submit' name='s' class='btn'>Update Employee</button>");
		out.println("</div></div></div>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
