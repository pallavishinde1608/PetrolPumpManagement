<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="org.petrolpump.admin.service.*,java.util.*,org.petrolpump.admin.model.*" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="CSS/ViewForm.css" rel="stylesheet">
</head>
<body>


<%@include file="AdminDashBoard.jsp" %>
<div class="col-md-8 viewform">
<br><br><br><br>
<h1>Machine Details</h1>
  <table class="table">
 
  <thead>
  <tr>
  <th scope="col" class="th">Sr.No</th>
  <th scope="col"  class="th">Employee Name</th> 
  <th scope="col"  class="th">Email</th>
  <th scope="col"  class="th">Contact</th>
   <th scope="col"  class="th">Allocate Machine</th>
  <th scope="col"  class="th">Delete</th> 
  <th scope="col"  class="th">Update</th> 
  </tr>
  </thead>
  <tbody>
  <%
  EmployeeService es=new EmployeeServiceIMPL();
   List<EmployeeModel> list=es.getAllEmployee();
  int count=0;
   for(EmployeeModel em:list)
   {
	 %>
	   <tr>
	     <th scope="row"><%=++count%></th>
	     <td><%=em.getName()%></td>
	     <td><%=em.getEmail() %></td>
	     <td><%=em.getContact()%></td>
	     
	     <td><a href='AlloEmpCon?empid=<%=em.getId()%>&empName=<%=em.getName()%>'>Allocate Machine</a></td>
	     <td><a href='delEmp?eid=<%=em.getId() %>'><ion-icon name="close-circle-outline" class="icon1"></ion-icon></a></td>
	     <td><a href='updemp?eid=<%=em.getId()%>&name=<%=em.getName()%>&email=<%=em.getEmail()%>&contact=<%=em.getContact()%>&address=<%=em.getAddress()%>&salary=<%=em.getSal()%>'><ion-icon name="sync-outline" class="icon1"></ion-icon></a></td>
	     </tr>
	 <%  
   }
  
  %>
 
  </tbody>
  </table>
   </div>
   </div>  
   </div>
   
   <script type="module" src="https://unpkg.com/ionicons@7.1.0/dist/ionicons/ionicons.esm.js"></script>
<script nomodule src="https://unpkg.com/ionicons@7.1.0/dist/ionicons/ionicons.js"></script>

</body>
</html>