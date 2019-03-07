<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Find Associate Details</title>
<style>
.error {
	color: red;
	font-weight: bold;
}
</style>
</head>
<body>
	<div align="center">
		<form action="findAssociate" method="post">
			<table>
				<tr>
					<td>AssociateId</td>
					<td><input type="text" name="associateId"></td>
				</tr>
				<tr>
					<td><a href="index"> BACK</a></td>
				</tr>
				<tr>
					<td><input type="submit" value="Click" />
				</tr>
			</table>
		</form>
	</div>
	<div align="left" class="error">${errorMessage}</div>
	<div align="center">
		${associate.firstName} <br> ${associate.lastName} <br>
		${associate.designation} <br> ${associate.department} <br>
		${associate.pancard} <br> ${associate.emailId} <br>
		${associate.yearlyInvestmentUnder80C} <br>
	</div>

</body>
</html>