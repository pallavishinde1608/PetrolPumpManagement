<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@page import="org.petrolpump.admin.model.*,org.petrolpump.admin.service.*,java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="CSS/AddMachine.css" rel="stylesheet">
</head>
<body>
<%@include file="AdminDashBoard.jsp" %>
<div class="col-md-8 admin ">
   <form class="formarea" name="frm" action="newMachine" method="Post">
  <div class="form-group ">
  <lable for="machinecode"><h1>Machine Code</h1></lable><br>
  <input type="text"class="form-control control" name="machineCode" id="machinecode" placeholder="enter machine code">
  <br><br>
   <table>
  <%
  FuelService fs=new FuelServiceIMPL();
		  List<FuelTypeModel> list=fs.getAllFuelType();
		  for(FuelTypeModel m:list)
		  {
			  %>
			  <tr>
			 
			  <td><input type='checkbox' name='ftype' value='<%=m.getId()%>'/>&nbsp;&nbsp;<%=m.getName()%></td>
			 <td><input type='text' name='capacity' value='' class='control'/><br></td>
			 
			  </tr>
			  <%
		  }
			 %> 
		  </table>
		 
  </div>
  <br><br>
 
  <button type="submit" class="btn btn-primary">Add New Machine</button>
   
   </form>
   </div>
   </div>  
   </div>
</body>
</html>