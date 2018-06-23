<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<title>Spring Boot + WebMVC + JPA + Bootstrap</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<meta http-equiv="Cache-Control" content="no-cache, no-store, must-revalidate" />

<!-- Bootstrap  -->
<link rel="stylesheet" href="/css/bootstrap.css">
<script src="/js/jquery.min.js"></script>
<script src="/js/bootstrap.min.js"></script>

</head>
<body>
	<div class="container">
		<h2>Spring Boot + WebMVC + JPA</h2>
		<table class="table table-striped">
			<thead>
				<tr>
					<th>Id</th>
					<th>Name</th>
					<th>Email</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="user" items="${users}">
					<tr>
						<td>${user.id}</td>
						<td>${user.name}</td>
						<td>${user.email}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>