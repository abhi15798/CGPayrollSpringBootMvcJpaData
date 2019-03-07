<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>NET SALARY</title>
<style type="text/css">
.result {
	background-color: aqua;
	font-size: 20px;
	font-style: italic;
}
</style>
</head>
<body>
	<form action="calculateSalary" method="post">
		<table>
			<tr>
				<td>AssociateId</td>
				<td><input type="text" name="associateId"></td>
			</tr>
			<tr>
				<td><a href="index"> ||BACK||</a></td>
			</tr>
			<tr>
				<td><input type="submit" value="Click" />
			</tr>
		</table>
	</form>
	<div align="center" class="result">NET SALARY= ${netSalary}</div>
</body>
</html>