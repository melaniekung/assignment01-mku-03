<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!-- success page called on submit from vehicle-mku-03 page -->

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Success Page</title>
</head>
<h1>${success}</h1>
<body>
	<table>
		<!-- request.getParameter used for paths set in vehicle-mku-03.jsp -->
		<tr>
			<td><label>Vehicle Type:</label></td>
			<td><%= request.getParameter("type") %></td>
		<tr>
			<td><label>Brand:</label></td>
			<td><%= request.getParameter("brand") %></td>
		</tr>
		<tr>
			<td><label>Year:</label></td>
			<td><%= request.getParameter("year") %></td>
		</tr>
		<!-- ${} methods used to get model attributes set in VehicleController_mku_03 -->
		<tr>
			<td><label>Wheels:</label></td>
			<td>${wheels}</td>
		</tr>
		<tr>
			<td><label>Power Source:&nbsp;&nbsp;</label></td>
			<td>${source}</td>
		</tr>
		<tr>
			<td><label>Sound:</label></td>
			<td>${sound}</td>
		</tr>
		<tr>
			<td><label>Seats:</label></td>
			<td>${seat}</td>
		</tr>
	</table>
</body>
</html>