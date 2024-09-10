<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<%@include file="EmployeeDashBoard.jsp" %>
<body>
<%
int empId=Integer.parseInt(session.getAttribute("empId").toString());
out.println("<h1>Hey your id is "+empId);
%>
</body>
</html>