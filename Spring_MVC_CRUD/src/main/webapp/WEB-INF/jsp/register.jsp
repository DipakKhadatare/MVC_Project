<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<style type="text/css">
body {
	font-family: sans-serif;
	margin: 0;
	padding: 0;
}

.container {
	width: 500px;
	margin: 0 auto;
	padding: 20px;
	border: 1px solid #ccc;
	border-radius: 10px;
}

h2 {
	text-align: center;
}

p {
	margin-bottom: 10px;
}

.form-group {
	margin-bottom: 10px;
}

label {
	font-weight: bold;
	margin-right: 10px;
}

input, textarea {
	width: 100%;
	padding: 10px;
	border: 1px solid #ccc;
	margin-bottom: 10px;
}

input[type="submit"] {
	background-color: #4CAF50;
	color: white;
	padding: 10px;
	border: none;
	cursor: pointer;
}

h4{
	text-align: center;
}

</style>
</head>

<body>

		<h4 style="color:green" >${successMsg }</h4>
		<h4 style="color:red">${errMsg }</h4>

	<div class="container">
		<h2>Student Registration Form</h2>
		<p>Please fill out the following form to register for our college.</p>
		<form action="register" method="post">

			<div class="form-group">
				<label for="firstname">First Name</label> <input type="text" name="firstname" id="firstname" placeholder="Enter your first name">
			</div>
			<div class="form-group">
				<label for="lastname">Last Name</label> <input type="text" name="lastname" id="lastname" placeholder="Enter your last name">
			</div>
			<div class="form-group">
				<label for="email">Email Address</label> <input type="email" name="email" id="email" placeholder="Enter your email address">
			</div>

			<div class="form-group">
				<label for="address">Address</label>
				<textarea name="address" id="address" placeholder="Enter your address"></textarea>
			</div>
			
			<div class="form-group">
				<label for="submit">Registration</label> <input type="submit" id="submit" value="Register">
			</div>
		</form>
	</div>
</body>

</html>