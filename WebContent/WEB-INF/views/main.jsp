<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table border="1">
		<tr>
			<th>Name</th>
			<th>Last Name</th>
			<th>Age</th>
			 <th>Status</th>
		</tr>
		<c:forEach items="${students}" var="students">
			<tr>
				<td>${students.sName}</td>
				<td>${students.lName}</td>
				<td>${students.sAge}</td>
				<td>${students.activoDelegate}</td>
			</tr>
		</c:forEach>
	</table>
   
   <br><br>
   <form action="${pageContext.request.contextPath}/form" method="post">
   	<label>Buscar por ID</label> <input type="number" name="id" ><br>
    	<input type= "submit" value= "Enviar">
   </form>
                
</body>
</html>