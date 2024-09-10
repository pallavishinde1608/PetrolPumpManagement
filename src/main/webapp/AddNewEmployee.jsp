<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="CSS/AddEmployee.css" rel="stylesheet">
</head>
<body>

<%@include file="AdminDashBoard.jsp" %>
<div class="col-md-8 admin ">
   <form class="formarea" name="frm" action="EmpCont" method="Post">
  <div class="form-group ">
  <lable for="machinecode"><h5>Employee Name</h5></lable>
  <input type="text"class="form-control control" name="name" id="machinecode" placeholder="enter employee name as ramesh">
   <lable for="machinecode"><h5>Employee Email</h5></lable>
  <input type="text"class="form-control control" name="email" id="machinecode" placeholder="enter employee email as ramesh@gmail.com">
 
   <lable for="machinecode"><h5>Employee Contact</h5></lable>
  <input type="text"class="form-control control" name="contact" id="machinecode" placeholder="enter employee contact as 7657865456">
  
   <lable for="machinecode"><h5>Employee Addrress</h5></lable>
  <input type="text"class="form-control control" name="address" id="machinecode" placeholder="enter employee address as pune">
  
   <lable for="machinecode"><h5>Employee Salary</h5></lable>
  <input type="text"class="form-control control" name="salary" id="machinecode" placeholder="enter employee salary as 30000">
  
  </div>
  
  <br>
 
  <button type="submit" class="btn btn-primary">Add New Employee</button>
   
   </form>
   </div>
   </div>  
   </div>

</body>
</html>