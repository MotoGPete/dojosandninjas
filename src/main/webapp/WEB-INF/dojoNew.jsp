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
		<H1 class="text-start">make a dojo</H1>
		<a href="/ninja/new">make a ninja</a>
	</div>
	<div class="container">
		<form:form action="/dojo/new" method="post"
			modelAttribute="newDojo" class="form">
			
			<form:label path="name" class="form-label">Dojo Name:</form:label>
			<form:input path="name" type="text" class="form-control" />
			<form:errors path="name" class="text-danger" />

			
			<button class="btn btn-primary">Submit</button>
		</form:form>
	</div>

</body>
</html>