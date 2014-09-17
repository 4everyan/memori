<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="t" %>


<t:genericpage>
	<jsp:attribute name="styles">
		<title>Learning</title>
		<link href="css/flashcards.css" rel="stylesheet">
	</jsp:attribute>
	
	<jsp:attribute name="header">
		<t:header />
	</jsp:attribute>

	<jsp:attribute name="footer">
		<t:footer />
	</jsp:attribute>

<jsp:body>
	<h1>Deck learning</h1>
	
</jsp:body>	
</t:genericpage>