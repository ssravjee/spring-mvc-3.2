<!DOCTYPE html>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<!-- saved from url=(0043)http://getbootstrap.com/examples/jumbotron/ -->

<html lang="en">

<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="http://getbootstrap.com/favicon.ico">

    <title>Jumbotron Template for Bootstrap</title>

    <!-- Bootstrap core CSS -->
    <link href="http://getbootstrap.com/dist/css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="http://getbootstrap.com/examples/jumbotron/jumbotron.css" rel="stylesheet">

    <!-- Just for debugging purposes. Don't actually copy these 2 lines! -->
    <!--[if lt IE 9]><script src="../../assets/js/ie8-responsive-file-warning.js"></script><![endif]-->
    <script src="./index_files/ie-emulation-modes-warning.js"></script><style type="text/css"></style>

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
  </head>

  <body>

	<!-- Main jumbotron for a primary marketing message or call to action -->
	<div class="jumbotron">
		<div class="container">
			<h1>Business to Business eCommerce</h1>
			<p>This is a template for a simple marketing or informational
				website. It includes a large callout called a jumbotron and three
				supporting pieces of content. Use it as a starting point to create
				something more unique.</p>
			<p>
				<a class="btn btn-primary btn-lg"
					href="http://getbootstrap.com/examples/jumbotron/#" role="button">Learn
					more »</a>
			</p>
		</div>
	</div>

	<div class="container">
		<!-- Example row of columns -->
		<div class="row">
			<div class="col-md-4">
				<h2>Create Profile</h2>
				<p>Donec id elit non mi porta gravida at eget metus. Fusce
					dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh,
					ut fermentum massa justo sit amet risus. Etiam porta sem malesuada
					magna mollis euismod. Donec sed odio dui.</p>
				<p>
				
					<c:url value="profile/create.html" var="messageUrl" />
					<a class="btn btn-default" 
					   href="${messageUrl}" role="button">Create Profiles >></a>
				</p>
			</div>
			<div class="col-md-4">
				<h2>List Profile</h2>
				<p>Donec id elit non mi porta gravida at eget metus. Fusce
					dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh,
					ut fermentum massa justo sit amet risus. Etiam porta sem malesuada
					magna mollis euismod. Donec sed odio dui.</p>
				<p>
					<c:url value="profile/list.html" var="messageUrl" />
					<a class="btn btn-default" 
					   href="${messageUrl}" role="button">List Profile >></a>
				</p>
			</div>
			<div class="col-md-4">
				<h2>Partners</h2>
				<p>Donec sed odio dui. Cras justo odio, dapibus ac facilisis in,
					egestas eget quam. Vestibulum id ligula porta felis euismod semper.
					Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum
					nibh, ut fermentum massa justo sit amet risus.</p>
				<p>
					<a class="btn btn-default"
						href="http://getbootstrap.com/examples/jumbotron/#" role="button">View
						details »</a>
				</p>
			</div>
		</div>


		<hr>

		<footer>
			<p>© Company 2015</p>
		</footer>
	</div>
	<!-- /container -->


	<!-- Bootstrap core JavaScript
    ================================================== -->
	<!-- Placed at the end of the document so the pages load faster -->
	<script src="./index_files/jquery.min.js"></script>
	<script src="./index_files/bootstrap.min.js"></script>
	<!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
	<script src="./index_files/ie10-viewport-bug-workaround.js"></script>  

</body></html>

		<%--
			!-- Create template -->
			<c:url value="/add.html" var="messageUrl" />
			<a href="${messageUrl}">Add Profile</a>
		--%>
