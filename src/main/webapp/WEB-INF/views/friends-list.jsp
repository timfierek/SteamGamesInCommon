<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>${player.personaName}'s friends</title>
</head>
<body>
	<h2>Select the friends you would like to find games in common with:</h2>
	<form action="/submit" method="post">
		<c:forEach var="friend" items="${friends}">
			${friend.personaName} <input type="checkbox" name="steamId[]" value="${friend.steamId}"/><br>
		</c:forEach>
		<input type="hidden" name="steamId[]" value="${player.steamId}"/>
		<input type="submit" value="Find games in common with these friends"/>
	</form>
</body>
</html>