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
<title>Country</title>
</head>
<body>

	<div align="center">
		<a href="/World/continent"> Return to continent</a><br>
		<br>
		<table>
			<tr>
				<th>Stati</th>
			</tr>
			<c:forEach items="${lista}" var="cont">
				<tr>
					<td><a href="/World/cities?thecountry=${cont.code}">
							${cont.name}</a><br></td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>