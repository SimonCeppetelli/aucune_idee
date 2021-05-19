<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!-- ajout de la lib form to spring -->
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!-- ajout de la lib core de jstl -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Ajout</title>
<!-- Ajout des librairies de style (bootstrap) -->
<link rel="stylesheet" href=<c:url value='/assets/css/bootstrap.css'/> />
</head>
<body>
	<h1 style="color: green; text-align: center;">page d'ajout de
		client</h1>
	<form action="submitAdd" method="post" enctype="multipart/form-data">
		Select File: <input type="file" name="photo" path="" /> <input type="submit"
			value="Upload File"/>
	</form>
</body>
</html>

