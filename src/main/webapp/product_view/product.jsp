<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>Product Page</title>
</head>
<body>
<section>
	<%@ page import="java.util.List" %>

	<% List<String> list = List.of("book", "pen", "paper"); %>

	<h1>List of Product</h1>
	<ul>
		<% for(String s: list) { %>

		<li> <%= s %> </li>

		<% } %>
	</ul>

</section>
</body>
</html>