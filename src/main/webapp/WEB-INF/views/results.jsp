<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Games in Common Results</title>
</head>
<body>
	<h2>Games in common between the following steam accounts: (list steam accounts here)</h2>
	<div>
		<ul>
			<c:forEach items="${games}" var="game">
				<li>${game}</li>
			</c:forEach>
		</ul>
	</div>
</body>
</html>