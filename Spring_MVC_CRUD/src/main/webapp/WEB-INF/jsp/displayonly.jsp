<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table border="1" cellpadding="10">
		<tr>
			<th>Id</th>
			<th>FirstName</th>
			<th>LastName</th>
			<th>Email</th>
			<th>Address</th>
		</tr>


		<tr>
			<td>${stddata.id}</td>
			<td>${stddata.firstname}</td>
			<td>${stddata.lastname}</td>
			<td>${stddata.email}</td>
			<td>${stddata.address }</td>

		</tr>


	</table>

</body>
</html>