<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page isELIgnored="false"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="t" %>


<t:genericpage>
	<jsp:attribute name="styles">
		<title>Login</title>
		<link href="<c:url value='/css/signin.css'/>" rel="stylesheet">
	</jsp:attribute>
	
	<jsp:body>
	<form class="form-signin" role="form" action="<c:url value='j_spring_security_check'/>" method="post">
		<h2 class="form-signin-heading">Please sign in</h2>
		<input type="text" class="form-control" placeholder="Your name" name="j_username" required autofocus>
		<input type="password" class="form-control" placeholder="Password" name="j_password" required>
		<label class="checkbox">
			<input type="checkbox" value="remember-me" disabled> Remember me
		</label>
		<button class="btn btn-lg btn-primary btn-block" type="submit">Sign in</button>
	</form>
	</jsp:body>
	
</t:genericpage>