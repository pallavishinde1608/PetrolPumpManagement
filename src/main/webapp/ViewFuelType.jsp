<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="org.petrolpump.admin.model.*,org.petrolpump.admin.service.*,java.util.*" %>
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
<h1>Fuel Details</h1>
  <table class="table">
 
  <thead>
  <tr>
  <th scope="col" class="th">Sr.No</th>
   <th scope="col"  class="th">Fuel Type id</th>
    <th scope="col"  class="th">Fuel Type</th>
  <th scope="col"  class="th">Delete</th>
  <th scope="col"  class="th">Update</th> 
  </tr>
  </thead>
  <tbody>
  <%
  FuelService fs=new FuelServiceIMPL();
  List<FuelTypeModel> list=fs.getAllFuelType();
  int count=0;
  for(FuelTypeModel f:list)
   {
	 %>
	   <tr>
	   <th scope="row"><%=++count%></th>
	   <td><%=f.getId()%></td>
	   <td><%=f.getName()%></td>
	   
	   <td><a href='DelFuel?fuelid=<%=f.getId() %>'><ion-icon name="close-circle-outline" class="icon1"></ion-icon></a></td>
	   
	   <td><a href='updFuel?typeid=<%=f.getId()%>&type=<%=f.getName()%>'><ion-icon name="sync-outline" class="icon1"></ion-icon></a></td>
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