<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration</title>
<script src="js/md5.min.js"></script>
<style>
body {
	background-color: #26253a;
}

form {
	max-width: 500px;
	margin: 0 auto;
	padding: 40px;
	background-color: #ffffff;
	border-radius: 5px;
	margin-top: 150px;
}

form input[type="text"], form input[type="password"], form input[type="email"]
	{
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
function submitRegister() {
  var password = document.getElementById('password').value;
  var encryptedPassword = md5(password);
  document.getElementById('password').value = encryptedPassword;
  document.getElementById("registerForm").submit();
}
</script>
<body>
	<form id = "registerForm" action="register">
		<p>PLEASE FILL IN THIS FORM TO CREATE YOUR ACCOUNT</p>
		<br>
		<c:forEach var="mess" items="${errorMessages}">
	    ${mess} 
		</c:forEach>
		<label for="fullname">Full Name:</label> <input type="text"
			id="fullname" name="fullname" placeholder="Enter your full name"
			required> <label for="username">Username:</label> <input
			type="text" id="username" name="username"
			placeholder="Enter a username" required> <label
			for="password">Password:</label> <input type="password" id="password"
			name="password" placeholder="Enter a password" required> <label
			for="email">Email:</label> <input type="email" id="email"
			name="email" placeholder="Enter your email address" required>

		<input type="submit" onclick="submitRegister()" value="Register">
	</form>
</body>
</html>
