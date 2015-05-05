<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>

   
<html>
	<head>
		<meta charset="utf-8">
		<title>List Profile</title>
		<style>
			.btn-default { 
				font: sans-serif;
				color: red;
			}
			.btn { 
				margin: 0.5em;
				padding: 1em;
			}
			.tableheading { 
				font: sans-serif;
				color: red;
				margin: 2.5em;
				padding: 1em;
			}
		</style>
	</head> 
	<body>
		<h2>Profile Names</h2>
		
		<div class="tableheading">Id Name Age</div>
		
		<c:forEach items="${profiles}" var="profile">
			<li>
					<c:url value="remove.html?id=${profile.id}" var="removeProfileUrl" />
					<a href="${removeProfileUrl}">X</a>
			${profile.id} &nbsp;
			${profile.name}&nbsp;
			${profile.age} 
			</li>		
		</c:forEach>
		<br/>
		<c:url value="create.html" var="messageUrl" />
			<a class="btn btn-default" href="${messageUrl}">Create Profiles</a>
	</body>
</html>


