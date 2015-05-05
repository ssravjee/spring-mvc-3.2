<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>    
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>Add Profile</title>
	</head> 
	<body>
	<a href="?language=en">English </a> |<a href="?language=es">Espanol </a> 
		<h2><spring:message code="profile.form.add.h1"/></h2>
	<form:form commandName="profile">
		<div id="heading">
			<label id="cols"><spring:message code="profile.form.label.name"/></label>
				<div id="rows">
					<form:input path="name"/>
				</div>
			<div id="submit">
				<input type="submit" value="Create">
			</div>
		</div>
	</form:form>		
	</body>
</html>
