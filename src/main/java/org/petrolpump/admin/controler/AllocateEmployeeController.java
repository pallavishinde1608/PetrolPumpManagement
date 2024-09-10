package org.petrolpump.admin.controler;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.petrolpump.admin.service.MachineService;
import org.petrolpump.admin.service.MachineServiceIMPL;


@WebServlet("/AlloEmpCon")
public class AllocateEmployeeController extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	  response.setContentType("text/html");	
	  PrintWriter out=response.getWriter();
	 // out.println("<h1>Allocate Machine Page..</h1>");
	  RequestDispatcher r=request.getRequestDispatcher("AdminDashBoard.jsp");
	  r.include(request, response);
	    MachineService ms=new MachineServiceIMPL();
	    List<Object[]> list=ms.getAllMachine();
	    LinkedHashMap <Integer,String>hs=new LinkedHashMap<Integer,String>();
	    for(Object obj[]:list)
	    {
	    	hs.put((Integer)obj[3],obj[0].toString());
	    }
	    int empid=Integer.parseInt(request.getParameter("empid"));
	    String empName=request.getParameter("empName");
	   // out.println("<h1>Hey "+empName+" we are going to allocate machine</h1>");
	    out.println("<link href='CSS/ViewEmp.css' rel='stylesheet'>");
	 
		out.println("<div class='col-md-8'>");
		 out.println("<h1>Hey "+empName+" we are going to allocate machine</h1>");
		out.println("<form class='formview' name='frm' action='FinalMachineAllocate' method='Post'>");
		out.println("<input type='hidden' name='empid' value='"+empid+"'/>");
		out.println("<select name='mid' class='control'>");
		out.println("<option>Select Machine</option>");
		Set<Map.Entry<Integer,String>> s=hs.entrySet();
		for(Map.Entry<Integer,String> m:s)
		{
			out.println("<option value='"+m.getKey()+"'>");
			out.println(m.getValue());
			out.println("</option");
		}
		out.println("</select>");
		out.println("<input type='time' name='startTime' value='' class='control'/><br><br>");
		out.println("<input type='time' name='endTime' value='' class='control'/><br><br>");
		out.println("<input type='date' name='AllDate' value='' class='control'/><br><br>");
		out.println("<button type='submit' name='s' class='buton' value='Allocate Machine To Employee'>Update Machine</button>");
		out.println("</div></div></div>");
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
