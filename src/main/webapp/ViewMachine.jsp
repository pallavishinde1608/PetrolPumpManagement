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
<%!   
MachineService ms=new MachineServiceIMPL();

%>
<%@include file="AdminDashBoard.jsp" %>
<div class="col-md-8 viewform">
<br><br><br><br>
<h1>Machine Details</h1>
  <table class="table">
 
  <thead>
  <tr>
  <th scope="col" class="th">Sr.No</th>
  <th scope="col"  class="th">Machine Code</th> 
   <th scope="col"  class="th">Fuel Type</th>
    <th scope="col"  class="th">Capacity</th>
  <th scope="col"  class="th">Delete</th>
  <th scope="col"  class="th">Update</th> 
  </tr>
  </thead>
  <tbody>
  <%
   List<Object[]> list=ms.getAllMachine();
  int count=0;
   for(Object obj[]:list)
   {
	 %>
	   <tr>
	   <td scope="row"><%=++count%></td>
	   <td><%=obj[0]%></td>
	    <td><%=obj[1]%></td>
	     <td><%=obj[2]%></td>
	   <td><a href='del?machineid=<%=obj[3]%>'><ion-icon name="close-circle-outline" class="icon1"></ion-icon></a></td>
	   <td><a href='updMachine?mid=<%=obj[3]%>&mcode=<%=obj[0].toString()%>'><ion-icon name="sync-outline" class="icon1"></ion-icon></a></td>
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