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
	<h2>Get steam games in common between multiple accounts. (add up to 8)</h2>
	<form method="post" action="/submit">
		<input type="text" name="steamId[]" required placeholder="Enter SteamID here"/><br><br>
		<input type="text" name="steamId[]" placeholder="Enter SteamID here"/><br><br>
		<input type="text" name="steamId[]" placeholder="Enter SteamID here"/><br><br>
		<input type="text" name="steamId[]" placeholder="Enter SteamID here"/><br><br>
		<input type="text" name="steamId[]" placeholder="Enter SteamID here"/><br><br>
		<input type="text" name="steamId[]" placeholder="Enter SteamID here"/><br><br>
		<input type="text" name="steamId[]" placeholder="Enter SteamID here"/><br><br>
		<input type="text" name="steamId[]" placeholder="Enter SteamID here"/><br><br>
		<input type="submit" value="Find games in common"/>
	</form>
	
	<h2>...or, select friends from your friends list: </h2>
	<form method="get" action="/display-friends">
		<input type="text" name="steamId" required placeholder="Paste your url or id here"/>
		<input type="submit" value="Get my friends list"/>
		<p>${errorMessage}</p>
	</form>
</body>
</html>