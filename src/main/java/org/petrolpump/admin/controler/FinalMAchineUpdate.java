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


@WebServlet("/FinalUpdate")
public class FinalMAchineUpdate extends HttpServlet {
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String btn=request.getParameter("s");
		
			int mid=Integer.parseInt(request.getParameter("mid"));
			String machineCode=request.getParameter("mcode");
			MachineModel model=new MachineModel();
			model.setId(mid);
			model.setMachineCode(machineCode);
			MachineService ms=new MachineServiceIMPL();
			boolean b=ms.isUpdatemachine(model);
			if(b)
			{
				RequestDispatcher r=request.getRequestDispatcher("ViewMachine.jsp");
				r.forward(request, response);
			}
			else {
				out.println("<h1>Machine data not updated.....");
			
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
