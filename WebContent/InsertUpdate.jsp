<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>
td {align = "center"
	
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Edit</title>
</head>
<body>
	<div align="center">
		<form action="insertUpdate">
			<input type=hidden value=${citta.id} name="id">
			<table border=1px>
				<tr>
					<th>Nome</th>
					<th>Stato</th>
					<th>Population</th>
				<tr>
					<td><input type=text name="citta" value=${citta.name}></td>

					<td><select name="code"><c:forEach
								items="${countries}" var="tmp">
								<option value=${tmp.countryCode }>${tmp.name}
							</c:forEach></select></td>

					<td><input type=number name="popolazione"
						value=${citta.population}></td>

				</tr>
			</table>
			<br> <input type="submit" value="salva">
		</form>
	</div>
</body>
</html>