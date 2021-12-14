<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ page isErrorPage="true"%>


<!DOCTYPE html>
<html>
<head>
<!-- for Bootstrap CSS -->
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<!-- YOUR own local CSS -->
<link rel="stylesheet" href="/css/main.css" />
<!-- For any Bootstrap that uses JS or jQuery-->
<script src="/webjars/jquery/jquery.min.js"></script>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
<title>dojo new</title>
</head>
<body>
	<div class="container text-center text-primary">
		<H1 class="text-start">${dojo.name} Dojo Location</H1>
		<a href="/dojo/new">make a dojo</a>
	</div>
	<div class="container">
		<h2>${dojo.name} Ninjas</h2>
		<ul>
			<c:forEach var="eachNinja" items="${dojo.ninjas}">
				<li>Name:${eachNinja.firstName}, ${eachNinja.lastName} Age:${eachNinja.age}</li>
			</c:forEach>			
		</ul>
			
			
	</div>

</body>
</html>