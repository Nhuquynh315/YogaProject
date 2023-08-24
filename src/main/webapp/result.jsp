<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP Upload Video</title>
</head>
<body>
	<c:forEach var="mess" items="${requestScope.message}">
	    ${message} 
	</c:forEach>

	<h2>Upload File</h2>
	<form method="post" action="UploadVideoServlet"
		enctype="multipart/form-data">
		Select file to upload: <input type="file" name="file" size="60" /><br />
		<br /> <input type="submit" value="Upload" />
	</form>
</body>
</html>