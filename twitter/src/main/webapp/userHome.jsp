<%@page import="com.twitter.model.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<style>
div {
  width: 320px;
  padding: 10px;
  border: 5px solid gray;
  margin: 0;
}
</style>

</head>
<body>
	<form action="userTweetAction">
		<% User user = (User)session.getAttribute("user"); %>
		Welcome<br>
		${user.getUserName()}
		<input type = "hidden" name = "id" value = "1">
		<input type = "text" name = "userTweet">
		<input type = "number" name = "parentId">
		<input type = "submit">
		<div>
			
		</div>
	</form>
</body>
</html>