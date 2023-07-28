<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">

table{
    border-collapse: collapse;
}

</style>
</head>
<body>

	<%-- 	<select name="" id="">
		<c:forEach var="empData" items="${empList }">
			<option value="${empData.id }">${empData.name }</option>
		</c:forEach>
	</select> --%>

	<table border="1" cellpadding="10">
		<tr>
			<th>Id</th>
			<th>FirstName</th>
			<th>LastName</th>
			<th>Email</th>
			<th>Address</th>
		</tr>

		<c:forEach var="stddata" items="${stdlist }">
			<tr>
				<td>${stddata.id}</td>
				<td>${stddata.firstname}</td>
				<td>${stddata.lastname}</td>
				<td>${stddata.email}</td>
				<td>${stddata.address }</td>

			</tr>
		</c:forEach>

	</table>

</body>
</html>