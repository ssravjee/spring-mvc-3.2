<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>

   
<html>
	<head>
		<meta charset="utf-8">
		<title>Remove Profile</title>
	</head> 
	<body>
		<h2>Remove Profile</h2>
		<c:url value="profile/create.html" var="messageUrl" />
			<a class="btn btn-default" href="${messageUrl}">Create Profiles</a>
	</body>
</html>


