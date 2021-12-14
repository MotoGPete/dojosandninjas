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
		<H1 class="text-start">make a ninja</H1>
		<a href="/dojo/new">make a dojo</a>
	</div>
	<div class="container">
		<form:form action="/ninja/new" method="post"
			modelAttribute="newNinja" class="form">
			
			<form:label path="firstName" class="form-label">First Name:</form:label>
			<form:input path="firstName" type="text" class="form-control" />
			<form:errors path="firstName" class="text-danger" />
			
			<form:label path="lastName" class="form-label">Last Name:</form:label>
			<form:input path="lastName" type="text" class="form-control" />
			<form:errors path="lastName" class="text-danger" />

			<form:label path="dojo" class="form-label">Vendor:</form:label>
			<form:select path="dojo">
				<c:forEach var="eachdojo" items="${dojos}">
				<form:option value="${eachdojo.id}">${eachdojo.name}</form:option>
				</c:forEach>
			</form:select>
			
			<form:label path="age" class="form-label">Age:</form:label>
			<form:input path="age" type="number" class="form-control" />
			<form:errors path="age" class="text-danger" />

			
			
			<button class="btn btn-primary">Cilit Bang</button>
		</form:form>
	</div>

</body>
</html>