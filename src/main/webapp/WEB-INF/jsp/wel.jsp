<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
@@  ${message}
<form action="register" method="post">
ID:
<input type="text" name="id">
<br>
Name:
<input type="text" name="name">

<br>
Age:
<input type="text" name="age">
<br>
Address
<input  type="text" name="address">
<br>
Submit:
<input type="submit">
</form>
</body>
</html>