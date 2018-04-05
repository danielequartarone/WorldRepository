<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/javascript" src="js/myscript.js"></script>
<link rel="stylesheet" type="text/css" href="css/mystyle.css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Continent</title>
</head>
<body>
<div align = "center">
<table>
<tr>
	<th>Continent</th>
</tr>

<c:forEach items="${continent}" var="tmp">
<tr>
<td>
<a href="/World/countries?thecontinent=${tmp}"> ${tmp} </a><br>
</td>
</tr>	 
</c:forEach>
</table>
</div>
</body>
</html>