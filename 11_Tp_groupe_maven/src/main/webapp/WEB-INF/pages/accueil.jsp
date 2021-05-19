<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>accueil</title>
<!-- Ajout des librairies de style (bootstrap) -->
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/assets/css/bootstrap.css" />
</head>
<body>
	<div class="container">
		<h1 style="color: green; text-align: center;">Liste des images</h1>
		<table class="table table-striped table-dark">
			<tr>
				<th>ID</th>
				<th>Photo</th>
			</tr>

			<c:forEach var="e" items="${produit}">
				<tr>
					<td>${e.idProduit}</td>
					<td> <img src="${e.img}"/></td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>