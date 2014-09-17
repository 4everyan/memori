<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="t" %>

<t:genericpage>
	<jsp:attribute name="styles">
		<title>Error 403 (forbidden)</title>
	</jsp:attribute>
	
	<jsp:attribute name="header">
		<t:header />
	</jsp:attribute>

	<jsp:attribute name="footer">
		<t:footer />
	</jsp:attribute>
	
	<jsp:body>
	<h3>Forbidden (403)</h3>
	</jsp:body>
</t:genericpage>