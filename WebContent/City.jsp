<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>
table, th, td {
	border: 1px solid black;
	text-align: center;
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>City</title>
</head>
<body>

	<div align="center">
		<a href="/World/countries?thecontinent=${continent}">Return to
			countries</a><br> <br>
			<p>${stringaSalvataggio}</p>
		<br><br>
		<form action="editCity">
			<input type="hidden" name="editThis" value=0> 
			<input type="submit" value="Add City"><br><br>
		</form>
		<table id="tabCity">
			<tr>
				<th>Citta</th>
				<th>Popolazione</th>
				<th>Stato</th>
				<th>Elimina citta</th>
			</tr>
			<c:forEach items="${cities}" var="tmp">
				<tr>

					<td>${tmp.name}</td>
					<td>${tmp.population }</td>
					<td>${tmp.countryCode}</td>
					<td>
						<form action="delete">
							<input type="hidden" value=${tmp.id } name="id"> <input
								type="hidden" value=${tmp.countryCode } name="code"> <input
								type="submit" value="elimina">
								
						</form>
					<td>
						<form action="editCity">
							<input type="hidden" value=${tmp.id } name ="editThis"> <input
								type="submit" value="edit">
						</form>
					</td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>