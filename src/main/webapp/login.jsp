<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
<script src="js/md5.min.js"></script>
<style>
body {
	background-color: #26253a;
}

form {
	max-width: 400px;
	margin: 0 auto;
	padding: 20px;
	background-color: #ffffff;
	border-radius: 5px;
	margin-top: 50px;
}

form input[type="text"], form input[type="password"] {
	width: 100%;
	padding: 12px;
	border: none;
	border-radius: 3px;
	margin-bottom: 10px;
	box-sizing: border-box;
	background-color: #ffffff;
	color: #26253a;
}

form input[type="submit"] {
	background-color: #26253a;
	color: #ffffff;
	padding: 12px 20px;
	border: none;
	border-radius: 3px;
	cursor: pointer;
	width: 100%;
	font-size: 18px; /* Adjust the font size as needed */
}
</style>
</head>
<script>
	function submitLogin() {
		var password = document.getElementById('password').value;
		var encryptedPassword = md5(password);
		document.getElementById('password').value = encryptedPassword;
		document.getElementById("loginForm").submit();
	}
</script>
<body>
	<form id="loginForm" action="LoginServlet" method="post">
		<c:forEach var="mess" items="${errorMessages}">
	    ${mess} 
		</c:forEach>
		<br><br>
		<label for="username">Username:</label> <input type="text"
			id="username" name="username" placeholder="Enter your username"
			value="${param.username}" /> <label for="password">Password:</label>
		<input type="password" id="password" name="password"
			placeholder="Enter your password" value="${param.password}">
		<input type="button" onclick="submitLogin()" value="Login">
	</form>
</body>
</html>