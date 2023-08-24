<%@page import="java.util.List"%>
<%@page import="model.Category"%>
<%@page import="model.Clazz"%>
<%@page import="dao.CategoryDAO"%>
<%@page import="dao.ClazzDAO"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html lang="en">
<head>
<!--
Fitness Template
http://www.templatemo.com/tm-487-fitness
-->
<title>Your Classes Today</title>
<meta name="description" content="">
<meta name="author" content="">
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=Edge">
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1">


<link rel="stylesheet" href="css/bootstrap.min.css">
<link rel="stylesheet" href="css/animate.css">
<link rel="stylesheet" href="css/font-awesome.min.css">
<link rel="stylesheet" href="css/owl.theme.css">
<link rel="stylesheet" href="css/owl.carousel.css">

<!-- Main css -->
<link rel="stylesheet" href="css/style.css">

<!-- Google Font -->
<link
	href='https://fonts.googleapis.com/css?family=Source+Sans+Pro:400,300,600'
	rel='stylesheet' type='text/css'>
<link href='https://fonts.googleapis.com/css?family=Lora:700italic'
	rel='stylesheet' type='text/css'>

</head>
<body data-spy="scroll" data-target=".navbar-collapse" data-offset="50">


	<!-- =========================
     PRE LOADER       
============================== -->
	<div class="preloader">

		<div class="sk-spinner sk-spinner-pulse"></div>

	</div>


	<!-- =========================
    NAVIGATION SECTION   
============================== -->
	<div class="navbar navbar-default navbar-fixed-top sticky-navigation"
		role="navigation">
		<div class="container">

			<div class="navbar-header">
				<button class="navbar-toggle" data-toggle="collapse"
					data-target=".navbar-collapse">
					<span class="icon icon-bar"></span> <span class="icon icon-bar"></span>
					<span class="icon icon-bar"></span>
				</button>
				<a href="home.jsp" class="navbar-brand">YogaWithBecky</a>
			</div>
			<div class="collapse navbar-collapse">
				<ul class="nav navbar-nav navbar-right main-navigation">
					<li><a href="home.jsp" class="smoothScroll">Home</a></li>
					<li><a href="ClazzServlet" class="smoothScroll">Classes</a></li>
					<li><a href="#trainer" class="smoothScroll">Try for free</a></li>
					<li><a href="logout.jsp" class="smoothScroll">Log out</a></li>
				</ul>
			</div>

		</div>
	</div>

	<!-- =========================
    HOME SECTION   
============================== -->
	<section id="home" class="parallax-section">
		<div class="container">
			<div class="row">

				<div class="col-md-10 col-sm-12">
					<h3 class="wow bounceIn" data-wow-delay="0.9s">Yoga With Becky
						Official</h3>
					<h3 class="wow fadeInUp" data-wow-delay="2.0s">Join the
						vibrant community of people seeking a happier, healthier, and more
						balanced version of themselves</h3>
				</div>

			</div>
		</div>
	</section>

	<!-- =========================
    CATEGORY SECTION  
============================== -->
	<div class="header">
		<form action="ClazzServlet">
			<input type="text" name="clazzName" value="${param.clazzName}">
			<input type="submit" value="Search">
		</form>
	</div>
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
		<div class="sub-body-clazz">
			<c:if test="${empty clazzList}">
			This class is not available
			</c:if>
			<c:if test="${not empty clazzList}">
				<ul>
					<c:forEach var="clazz" items="${clazzList}">
						<a href="ClazzDetailServlet?clazzId=${clazz.id}">
							<li>${clazz.name}</li>
						</a>
					</c:forEach>
				</ul>
			</c:if>
		</div>
	</div>
	<!-- =========================
    INCLUDE FOOTER 
============================== -->
	<jsp:include page="footer.jsp"></jsp:include>
	<!--include footer ended -->

</body>
</html>