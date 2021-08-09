<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%--   <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %> --%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>	
<body>
<c:forEach items="${student}" var="student">
welcome my page
${student.id}
${student.name}
${student.age}
${student.address}
 <a href="editPage?id=${student.id}">update</a> 
</c:forEach>
</body>
</html>