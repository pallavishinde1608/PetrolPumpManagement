<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="CSS/FuelType.css" rel="stylesheet">
</head>
<body>
<%@include file="AdminDashBoard.jsp" %>
<div class="col-md-8">
   <form class="formfuel" name="frm" action="newFuel" method="Post">
  <div>
  <lable for="FuelType"><h1>Machine Fuel Type</h1></lable><br>
  <input type="text"class="form-control c" name="FuelType" id="FuelType" placeholder="Enter Fuel Type">
  </div>
  <br>
  <button type="submit" class="btn btn-primary">Add New Fuel Type</button>
   
   </form>
   </div>
   </div>  
   </div>
   </div>
</body>
</html>