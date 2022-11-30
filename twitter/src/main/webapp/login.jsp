<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="userLogin">
		Name <input type = "text" name = "userName" required><br>
		password <input type = "password" name = "password" required><br>
		<input type = "hidden" name = "id" value  = "0">
		<input type ="submit">
	</form>
</body>
</html>