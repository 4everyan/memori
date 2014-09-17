<%@ tag language="java" description="Overall Page template" pageEncoding="UTF-8"%>
<%@ attribute name="styles" fragment="true" %>
<%@ attribute name="header" fragment="true" %>
<%@ attribute name="footer" fragment="true" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>

<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<meta name="description" content="">
	<meta name="author" content="">
	<link rel="icon" href="favicon.ico">
	
	<!-- Bootstrap core CSS -->
	<link href="<c:url value='/css/bootstrap.min.css' />" rel="stylesheet">
	
	<!-- Bootstrap theme CSS -->
	<link href="<c:url value='/css/bootstrap-theme.min.css' />" rel="stylesheet">
	
	<!-- Custom styles for this template -->
	<link href="<c:url value='/css/main.css' />" rel="stylesheet">
	
	<jsp:invoke fragment="styles" />
	
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
</head>

<body>
	<div class="container">
		<jsp:invoke fragment="header" />
		<jsp:doBody />
		<jsp:invoke fragment="footer" />
	</div><!-- /container -->
	
	
	<!-- Bootstrap core JavaScript
	    ================================================== -->
	<!-- Placed at the end of the document so the pages load faster -->
	<script src="<c:url value='/js/bootstrap.min.js' />"></script>
</body>
</html>