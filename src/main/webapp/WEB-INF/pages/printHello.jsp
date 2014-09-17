<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="t" %>


<t:genericpage>
	<jsp:attribute name="styles">
		<title>Hello</title>
	</jsp:attribute>
	
	<jsp:attribute name="header">
		<t:header />
	</jsp:attribute>

	<jsp:attribute name="footer">
		<t:footer />
	</jsp:attribute>

<jsp:body>
	<h1>Hello</h1>
	<table class="table">
	<tr><td>User name</td><td><c:out value="${username}"></c:out></td></tr>
	<tr><td>User is authenticated</td><td><c:out value="${isAuthenticated}"></c:out></td></tr>
	<tr><td>User authorities</td><td><c:out value="${authorities}"></c:out></td></tr>
	</table>
	
</jsp:body>	
</t:genericpage>