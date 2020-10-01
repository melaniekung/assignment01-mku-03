<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false" %>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Vehicle Profile</title>
</head>
<body>

	<h1>Vehicle Profile</h1>

	<form:form method="POST" modelAttribute="vehicle-mku-03">
		<table>
			<!-- radio button to get type of vehicle -->
			<tr>
				<td><label>Vehicle Type:</label></td>
				<td><form:radiobutton path="type" value="Car" />Car 
				<form:radiobutton path="type" value="Bike" />Bike 
				<form:errors path="type" style="color:red" /></td>
			</tr>
			<!-- input to get brand of vehicle -->
			<tr>
				<td><label>Brand:</label></td>
				<td><form:input type="text" path="brand" value="" /> 
				<form:errors path="brand" style="color:red" /></td>
			</tr>
			<!-- dropdown menu to get year of vehicle -->
			<tr>
				<td><label>Year:</label></td>
				<td><form:select path="year" id="year">
						<form:option value="">Select Year</form:option>
						<form:options items="${years}"/>
					</form:select> <form:errors path="year" style="color:red" /></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="Submit"></td>
			</tr>
		</table>
	</form:form>
</body>
</html>