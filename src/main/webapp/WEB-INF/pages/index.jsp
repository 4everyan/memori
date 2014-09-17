<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="sec" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="t" %>


<t:genericpage>
	<jsp:attribute name="styles">
		<title>Welcome</title>
	</jsp:attribute>
	
	<jsp:attribute name="header">
		<t:header />
	</jsp:attribute>

	<jsp:attribute name="footer">
		<t:footer />
	</jsp:attribute>

	<jsp:body>
		<h3>Index page</h3>
		<p>Index page. Try open pages:</p>
		<ul>
			<li><a href="<c:url value='/hello'/>">Hello page</a></li>
			<li><a href="<c:url value='/hi'/>">Hi page</a></li>
		</ul>
		<p>Logout: <a href="logout">click to logout</a></p>
	</jsp:body>
</t:genericpage>