<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="update" method="post">
ID:
<input type="text" name="id" value="${entity.id}">
<br>
Name:
<input type="text" name="name" value="${entity.name}">
<%-- <input type="text" class="form-control" name="employeeName" value="${employeeEntity.employeeName}">
 --%><br>
Age:
<input type="text" name="age" value="${entity.age}">
<br>
Address
<input  type="text" name="address" value="${entity.address}">
<br>
Submit:
<input type="submit">
</body>
</html>