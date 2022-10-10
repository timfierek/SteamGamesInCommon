<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Games in Common</title>
</head>
<body>
	<h4>Get steam games in common between multiple accounts.</h4>
	<form method="post" action="/submit">
		<input type="text" name="steamId1" required placeholder="Enter SteamID here"/><br>
		<input type="text" name="steamId2"/><br>
		<input type="text" name="steamId3"/><br>
		<input type="text" name="steamId4"/><br>
		<input type="text" name="steamId5"/><br>
		<input type="submit" value="test"/>
	</form>
</body>
</html>