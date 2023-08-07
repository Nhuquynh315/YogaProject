<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
<!--
Fitness Template
http://www.templatemo.com/tm-487-fitness
-->
<title>Fitness - Responsive HTML Template</title>
<meta name="description" content="">
<meta name="author" content="">
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=Edge">
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">


<link rel="stylesheet" href="css/bootstrap.min.css">
<link rel="stylesheet" href="css/animate.css">
<link rel="stylesheet" href="css/font-awesome.min.css">
<link rel="stylesheet" href="css/owl.theme.css">
<link rel="stylesheet" href="css/owl.carousel.css">
 
<!-- Main css -->
<link rel="stylesheet" href="css/style.css">

<!-- Google Font -->
<link href='https://fonts.googleapis.com/css?family=Source+Sans+Pro:400,300,600' rel='stylesheet' type='text/css'>
<link href='https://fonts.googleapis.com/css?family=Lora:700italic' rel='stylesheet' type='text/css'>

</head>
<body data-spy="scroll" data-target=".navbar-collapse" data-offset="50">


<!-- =========================
     PRE LOADER       
============================== -->
<div  class="preloader">

	<div class="sk-spinner sk-spinner-pulse"></div>

</div>


<!-- =========================
    NAVIGATION SECTION   
============================== -->
<div class="navbar navbar-default navbar-fixed-top sticky-navigation" role="navigation">
	<div class="container">

		<div class="navbar-header">
			<button class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
				<span class="icon icon-bar"></span>
				<span class="icon icon-bar"></span>
				<span class="icon icon-bar"></span>
			</button>
			<a href="#" class="navbar-brand">YogaWithBecky</a>
		</div>
		<div class="collapse navbar-collapse">
			<ul class="nav navbar-nav navbar-right main-navigation">
				<li><a href="home.jsp" class="smoothScroll">Home</a></li>
				<li><a href="#overview" class="smoothScroll">Classes</a></li>
				<li><a href="#trainer" class="smoothScroll">Who is Becky</a></li>
				<li><a href="#blog" class="smoothScroll">Blog</a></li>
				<li><a href="login.jsp" class="smoothScroll">Log in</a></li>
				<li><a href="register.jsp" class="smoothScroll">Register</a></li>
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

			<div class="col-md-offset-1 col-md-10 col-sm-12">
				<h3 class="wow bounceIn" data-wow-delay="0.9s">Yoga With Becky Official</h3>
				<h1 class="wow fadeInUp" data-wow-delay="2.0s">Your #1 stop for at home yoga, fitness workouts,<br>pilates, life style, and so much more.</h1>
				<h3 class="wow fadeInUp" data-wow-delay="2.0s">Join the vibrant community of people seeking a happier, healthier, and more balanced version of themselves</h3>
				<a href="#overview" class="wow fadeInUp smoothScroll btn btn-default" data-wow-delay="2s">LEARN MORE</a>
			</div>

		</div>
	</div>
</section>


<!-- =========================
    OVERVIEW SECTION   
============================== -->
<section id="overview" class="parallax-section">
	<div class="container">
		<div class="row">

			<div class="col-md-6 col-sm-12">
				<img src="images/overview-img.jpg" class="img-responsive" alt="Overview">
				<blockquote class="wow fadeInUp" data-wow-delay="1.9s">Join the vibrant community of people seeking a happier, healthier, and more balanced version of themselves!</blockquote>
			</div>

			<div class="col-md-1"></div>

			<div class="wow fadeInUp col-md-4 col-sm-12" data-wow-delay="1s">
				<div class="overview-detail">
					<h2>Yoga Classes</h2>
					<p>Stream & Download the Entire Library of Videos and Classes Anywhere Anytime!</p>
					<p>Join our blog at <a href="blog-single.html">blog page</a>.</p>
					<a href="#trainer" class="btn btn-default smoothScroll">Start your free trial</a>
				</div>
			</div>

			<div class="col-md-1"></div>

		</div>
	</div>
</section>


<!-- =========================
    WHO IS BECKY SECTION   
============================== -->
<section id="whoIsBecky" class="parallax-section">
	<div class="container">
		<div class="row">

			<div class="wow fadeInUp col-md-12 col-sm-12" data-wow-delay="1.3s">
				<h2>Who Is Becky</h2>
				<p>Lorem ipsum dolor sit amet, maecenas eget vestibulum justo.</p>
			</div>

			<div class="wow fadeInUp col-md-4 col-sm-6" data-wow-delay="1.9s">
				<div class="whoIsBecky-thumb">
					<img src="images/trainer-img1.jpg" class="img-responsive" alt="whoIsBecky">
						<div class="whoIsBecky-overlay">
							<div class="whoIsBecky-des">
								
								<h3>Yoga Instructor</h3>
								<ul class="social-icon">
									<li><a href="#" class="fa fa-facebook wow fadeInUp" data-wow-delay="1s"></a></li>
									<li><a href="#" class="fa fa-twitter wow fadeInUp" data-wow-delay="1.3s"></a></li>
									<li><a href="#" class="fa fa-behance wow fadeInUp" data-wow-delay="1.9s"></a></li>
								</ul>
							</div>
						</div>
				</div>
				<p>Lorem ipsum dolor sit amet, maecenas eget vestibulum justo imperdiet, wisi risus purus augue vulputate.</p>
			</div>

			<div class="wow fadeInUp col-md-4 col-sm-6" data-wow-delay="2s">
				<div class="trainer-thumb">
					<img src="images/trainer-img2.jpg" class="img-responsive" alt="Trainer">
						<div class="whoIsBecky-overlay">
							<div class="whoIsBecky-des">
								
								<h3>200hrs Certificate</h3>
								<ul class="social-icon">
									<li><a href="#" class="fa fa-facebook wow fadeInUp" data-wow-delay="1s"></a></li>
									<li><a href="#" class="fa fa-twitter wow fadeInUp" data-wow-delay="1.3s"></a></li>
									<li><a href="#" class="fa fa-behance wow fadeInUp" data-wow-delay="1.9s"></a></li>
								</ul>
							</div>
						</div>
				</div>
				<p>Lorem ipsum dolor sit amet, maecenas eget vestibulum justo imperdiet, wisi risus purus augue vulputate.</p>
			</div>

			<div class="wow fadeInUp col-md-4 col-sm-6" data-wow-delay="2.3s">
				<div class="whoIsBecky-thumb">
					<img src="images/trainer-img3.jpg" class="img-responsive" alt="Trainer">
						<div class="whoIsBecky-overlay">
							<div class="whoIsBecky-des">
								
								<h3>10,000 students</h3>
								<ul class="social-icon">
									<li><a href="#" class="fa fa-facebook wow fadeInUp" data-wow-delay="1s"></a></li>
									<li><a href="#" class="fa fa-twitter wow fadeInUp" data-wow-delay="1.3s"></a></li>
									<li><a href="#" class="fa fa-behance wow fadeInUp" data-wow-delay="1.9s"></a></li>
								</ul>
							</div>
						</div>
				</div>
				<p>Lorem ipsum dolor sit amet, maecenas eget vestibulum justo imperdiet, wisi risus purus augue vulputate.</p>
			</div>

		</div>
	</div>
</section>


<!-- =========================
    NEWSLETTER SECTION   
============================== -->
<section id="newsletter" class="parallax-section">
	<div class="container">
		<div class="row">

			<div class="wow fadeInUp col-md-offset-2 col-md-8 col-sm-offset-1 col-sm-10" data-wow-delay="0.9s">
				<h2>No risk. Sign up. Leave anytime!</h2>
				
				<div class="newsletter_detail">
					<form action="#" method="post" id="newsletter-signup">
						<div class="col-md-6 col-sm-6">
							<input name="name" type="text" class="form-control" id="name" placeholder="Name">
					  	</div>
						<div class="col-md-6 col-sm-6">
							<input name="email" type="email" class="form-control" id="email" placeholder="Email">
					  	</div>
						<div class="col-md-offset-3 col-md-6 col-sm-offset-2 col-sm-8">
							<input name="submit" type="submit" class="form-control" id="submit" value="START YOUR FREE TRIAL">
						</div>
				  	</form>
				</div>
			</div>

		</div>
	</div>
</section>


<!-- =========================
    BLOG SECTION   
============================== -->
<section id="blog" class="parallax-section">
	<div class="container">
		<div class="row">

			<div class="col-md-12 col-sm-12 text-center">
				<h2>Blog</h2>
				<p>Lorem ipsum dolor sit amet, maecenas eget vestibulum justo.</p>
			</div>

			<div class="wow fadeInUp col-md-6 col-sm-12" data-wow-delay="0.9s">
				<div class="blog-thumb">
					<span class="blog-date">Body Fitness / July 2, 2016</span>
					<h3 class="blog-title"><a href="blog-single.html">How to get a fitness model body?</a></h3>
					<h5 id="blog-author">by David Walker</h5>
				</div>
			</div>

			<div class="wow fadeInUp col-md-6 col-sm-12" data-wow-delay="1.3s">
				<div class="blog-thumb">
					<span class="blog-date">Healthy Fit / June 8, 2016</span>
					<h3 class="blog-title"><a href="blog-single.html">Personal Fitness Tips</a></h3>
					<h5 id="blog-author">by George</h5>
				</div>
			</div>

			<div class="wow fadeInUp col-md-6 col-sm-12" data-wow-delay="1.6s">
				<div class="blog-thumb">
					<span class="blog-date">Gym Services / May 9, 2016</span>
					<h3 class="blog-title"><a href="blog-single.html">Efficient Workout Plans</a></h3>
					<h5 id="blog-author">by Mary Louis</h5>
				</div>
			</div>

			<div class="wow fadeInUp col-md-6 col-sm-12" data-wow-delay="1.9s">
				<div class="blog-thumb">
					<span class="blog-date">Practice Aerobics / April 18, 2016</span>
					<h3 class="blog-title"><a href="blog-single.html">How to practice Aerobics?</a></h3>
					<h5 id="blog-author">by Michael Fit</h5>
				</div>
			</div>
			
		</div>
	</div>
</section>


<!-- =========================
    OUR PRICE SECTION   
============================== -->
<section id="our price" class="parallax-section">
	<div class="container">
		<div class="row">

			<div class="wow fadeInUp col-md-12 col-sm-12" data-wow-delay="0.9s">
				<h2>Ready to get started?</h2>
				<p>Lorem ipsum dolor sit amet, maecenas eget vestibulum justo.</p>
			</div>

			<div class="wow fadeInUp col-md-4 col-sm-6" data-wow-delay="1s">
				<div class="pricing__item">
                    <h3 class="pricing__title">Monthly</h3>
                    <div class="pricing__price"><span class="pricing__currency">$</span>27,99</div>
                    <ul class="pricing__feature-list">
                        <li class="pricing__feature">Try free for 7 days</li>
                        <li class="pricing__feature">3000+ on demand yoga practices</li>
                        
                        <li class="pricing__feature">2700+ articles and resources</li>
                        <li class="pricing__feature">300+ courses and challenges</li>
                    </ul>
                    <button class="pricing__action">Sign Up Now</button>
                </div>
			</div>

			<div class="wow fadeInUp col-md-4 col-sm-6" data-wow-delay="1.3s">
				<div class="pricing__item">
                    <h3 class="pricing__title">Yearly</h3>
                    <div class="pricing__price"><span class="pricing__currency">$</span>275</div>                  
                    <ul class="pricing__feature-list">
                        <li class="pricing__feature">Try free for 7 days</li>
                        <li class="pricing__feature">Save $60.88 annually</li>
                        <li class="pricing__feature">Free digital practice journal</li>
                        <li class="pricing__feature">Unlimited access to all classes</li>
  
                    </ul>
                    <button class="pricing__action">Sign Up Now</button>
                </div>
			</div>

			<div class="wow fadeInUp col-md-4 col-sm-6" data-wow-delay="1.6s">
				<div class="pricing__item">
                    <h3 class="pricing__title">Premium Training</h3>
                    
                    <ul class="pricing__feature-list">
                        <li class="pricing__feature">Access to classes you want to improve</li>
                        <li class="pricing__feature">Inspire your growth</li>
                        <li class="pricing__feature">Expand your knowledge</li>
                        <li class="pricing__feature">Develop your journey</li>
                        <li class="pricing__feature">Teacher certificate</li>
                    </ul>
                   <button class="pricing__action">Click to choose classes</button>
                </div>
			</div>

		</div>
	</div>
</section>


<!-- =========================
    TESTIMONIAL SECTION   
============================== -->
<section id="testimonial" class="parallax-section">
	<div class="container">
		<div class="row">

			<!-- Testimonial Owl Carousel section
			================================================== -->
			<div id="owl-testimonial" class="owl-carousel">

				<div class="item col-md-offset-2 col-md-8 col-sm-offset-1 col-sm-10 wow fadeInUp" data-wow-delay="0.6s">
					<i class="fa fa-quote-left"></i>
					<h3>Lorem ipsum dolor sit amet, maecenas eget vestibulum justo imperdiet, wisi risus purus augue vulputate.</h3>
					<h4>Sandar ( Fashion Designer )</h4>
				</div>

				<div class="item col-md-offset-2 col-md-8 col-sm-offset-1 col-sm-10 wow fadeInUp" data-wow-delay="0.6s">
					<i class="fa fa-quote-left"></i>
					<h3>Yes! Lorem ipsum dolor sit amet, maecenas eget vestibulum justo imperdiet, wisi risus purus augue.</h3>
					<h4>James Job ( Social Assistant )</h4>
				</div>

				<div class="item col-md-offset-2 col-md-8 col-sm-offset-1 col-sm-10 wow fadeInUp" data-wow-delay="0.6s">
					<i class="fa fa-quote-left"></i>
					<h3>Sed dapibus rutrum lobortis. Sed nec interdum nunc, quis sodales ante. Maecenas volutpat congue.</h3>
					<h4>Mark Otto ( New Cyclist )</h4>
				</div>

				<div class="item col-md-offset-2 col-md-8 col-sm-offset-1 col-sm-10 wow fadeInUp" data-wow-delay="0.6s">
					<i class="fa fa-quote-left"></i>
					<h3>Lorem ipsum dolor sit amet, maecenas eget vestibulum justo imperdiet, wisi risus purus.</h3>
					<h4>David Moore ( Pro Boxer )</h4>
				</div>
				
			</div>

		</div>
	</div>
</section>


<!-- =========================
    FOOTER SECTION   
============================== -->
<footer>
	<div class="container">
		<div class="row">

			<div class="wow fadeInUp col-md-4 col-sm-4" data-wow-delay="0.6s">
				<h2>About Fitness</h2>
				<p>Nunc id turpis tincidunt dui volutpat hendrerit et efficitur dolor. Morbi quis tempor felis, ut dictum ipsum. Praesent venenatis rutrum interdum.</p>
			</div>

			<div class="wow fadeInUp col-md-5 col-sm-4"  data-wow-delay="0.9s">
				<h2>Sessions</h2>
					<div>
						<h5>Morning</h5>
						<h4>6:00 AM - 11:00 PM</h4>
					</div>
					<div>
						<h5>Evening</h5>
						<h4>4:00 PM - 9:00 PM</h4>
					</div>
			</div>

			<div class="wow fadeInUp col-md-3 col-sm-4" data-wow-delay="1s">
				<h2>Follow us</h2>
				<ul class="social-icon">
					<li><a href="#" class="fa fa-facebook wow fadeIn" data-wow-delay="1s"></a></li>
					<li><a href="#" class="fa fa-twitter wow fadeInUp" data-wow-delay="1.3s"></a></li>
					<li><a href="#" class="fa fa-dribbble wow fadeIn" data-wow-delay="1.6s"></a></li>
					<li><a href="#" class="fa fa-behance wow fadeInUp" data-wow-delay="1.9s"></a></li>
					<li><a href="#" class="fa fa-google-plus wow fadeIn" data-wow-delay="2s"></a></li>
				</ul>
			</div>

			<div class="clearfix"></div>

			<div class="col-md-12 col-sm-12">
				<p class="copyright-text">Copyright &copy; 2016 Your Company 
                    
                    | Design: TemplateMo</p>
			</div>
			
		</div>
	</div>
</footer>

<!-- =========================
     SCRIPTS   
============================== -->
<script src="js/jquery.js"></script>
<script src="js/bootstrap.min.js"></script>
<script src="js/jquery.parallax.js"></script>
<script src="js/jquery.nav.js"></script>
<script src="js/jquery.backstretch.min.js"></script>
<script src="js/owl.carousel.min.js"></script>
<script src="js/smoothscroll.js"></script>
<script src="js/wow.min.js"></script>
<script src="js/custom.js"></script>

</body>
</html>