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
	<h4>Get steam games in common between multiple accounts. (add up to 8)</h4>
	<form method="post" action="/submit">
		<input type="text" name="steamId[]" required placeholder="Enter SteamID here"/><br><br>
		<input type="text" name="steamId[]" placeholder="Enter SteamID here"/><br><br>
		<input type="text" name="steamId[]" placeholder="Enter SteamID here"/><br><br>
		<input type="text" name="steamId[]" placeholder="Enter SteamID here"/><br><br>
		<input type="text" name="steamId[]" placeholder="Enter SteamID here"/><br><br>
		<input type="text" name="steamId[]" placeholder="Enter SteamID here"/><br><br>
		<input type="text" name="steamId[]" placeholder="Enter SteamID here"/><br><br>
		<input type="text" name="steamId[]" placeholder="Enter SteamID here"/><br><br>
		<input type="submit" value="test"/>
	</form>
</body>
</html>