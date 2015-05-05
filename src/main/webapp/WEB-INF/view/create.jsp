<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>    
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>Create Profile</title>
	</head> 
	<body>
	<a href="?language=en">English </a> |<a href="?language=es">Espanol </a> 
		<h2><spring:message code="profile.form.add.h1"/></h2>
	<form:form commandName="profile">
		<div id="heading">
				<label id="cols">
					<spring:message code="profile.form.name"/>
				</label>
				<div id="rows">
					<label id="rows">
						<spring:message code="profile.form.id"/>
					</label>		
					<form:input path="id"/>
				</div>
				<div id="rows">
					<label id="rows">
						<spring:message code="profile.form.name"/>
					</label>		
					<form:input path="name"/>
				</div>
				<div id="rows">
					<label id="rows">
						<spring:message code="profile.form.age"/>
					</label>		

					<form:input path="age"/>
				</div>

			<div id="submit">
				<input type="submit" value="Create">
			</div>
		</div>
	</form:form>		
	</body>
</html>
