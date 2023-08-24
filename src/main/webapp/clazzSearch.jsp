<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div class="header">
		<form action="clazzSearch.jsp">
			<input type="text" name="clazzName" value="${param.clazzName}">
			<input type="submit" value="Search">
		</form>
	</div>
	<hr>
	<div class="body">

		<div class="sub-body-category">
			<ul>
				<c:forEach var="category" items="${categoryList}">
					<a href="ClazzServlet?categoryId=${category.id}">
						<li>${category.name}</li>
					</a>
				</c:forEach>
			</ul>
		</div>
		<div class="sub-body-search">

			<c:if test="${empty clazzList}">
			THERE IS NO CLASS AVAILABLE
		</c:if>
			<c:if test="${not empty clazzList}">
				<ul>
					<c:forEach var="clazz" items="${clazzList}">
						<a href="ClazzSearchServlet?clazzName=" ${'%'} ${clazz.name}${'%'}">
							<li>${clazz.name}</li>
						</a>
					</c:forEach>
				</ul>
			</c:if>
		</div>

	</div>
</body>
</html>