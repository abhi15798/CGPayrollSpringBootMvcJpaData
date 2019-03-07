<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All Associate</title>
<style type="text/css">
.details{
text-align:left;
table-layout: auto;
text-overflow: ellipsis;
background-color: aqua;
font-size:25px;
}
</style>
</head>
<body>

	<div align="left" class="details">
		<s:forEach var="associate" items="${associates}">
			${associate}  <br>
		</s:forEach>
	</div>
	<br><br><br><br><br>
	<div align="center">
	<a href="index">||BACK||</a>
	</div>
	
</body>
</html>