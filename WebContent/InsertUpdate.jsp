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
			<table border=1px>
				<tr>
					<th>Nome</th>
					<th>Code</th>
					<th>Population</th>
				<tr>
					<td><input type=text name="nome"></td>

					<td><select name="code"><c:forEach
								items="${countries}" var="tmp">
								<option value=${tmp }>${tmp}
							</c:forEach></select></td>

					<td><input type=number name="popolazione" value = ${citta.population }></td>

				</tr>
			</table>
			<br> <input type="submit" value="salva"> <input
				type=hidden value=${citta.id } name="id">
		</form>

		<p>${stringaSalvataggio}</p>
		<br>
	</div>
</body>
</html>