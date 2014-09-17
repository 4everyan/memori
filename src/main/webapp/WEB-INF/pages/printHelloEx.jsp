<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>

<%@ taglib tagdir="/WEB-INF/tags" prefix="t" %>


<t:genericpage>
	<jsp:attribute name="styles">
		<title>Hi</title>
	</jsp:attribute>
	
	<jsp:attribute name="header">
		<t:header />
	</jsp:attribute>

	<jsp:attribute name="footer">
		<t:footer />
	</jsp:attribute>

	<jsp:body>
	<h3>Hi!</h3>
	<em>You have granted access to this page. Congratulations!</em>
	</jsp:body>
	
</t:genericpage>