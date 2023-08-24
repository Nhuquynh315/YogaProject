<%@page import="model.Clazz"%>
<%@page import="dao.ClazzDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Video list</title>
</head>
<body>
	<ul>
		<c:forEach var="clazz" items="${clazzlist}">
			<li>${clazz.name} </li>
		</c:forEach>
	</ul>

</body>
</html>