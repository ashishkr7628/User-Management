<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<%@ include file="components1/bootstrap.jsp"%>
</head>
<body>
	<%@ include file="components1/navbar.jsp"%>
	<div
		class="row p-4 pb-0 pe-lg-0 pt-lg-5 align-items-center rounded-3 border shadow-lg">
		<div class="col-lg-7 p-3 p-lg-5 pt-lg-3">
			<h1 class="display-4 fw-bold lh-1">User Management System</h1>
			<p class="lead">A user management system (UMS) is a software
				solution designed to manage and control user accounts within an
				organization or application. It typically includes features for
				creating, modifying, and deleting user accounts, assigning roles and
				permissions, and managing user access to various resources and
				services.</p>
			<div
				class="d-grid gap-2 d-md-flex justify-content-md-start mb-4 mb-lg-3">
				<a href="register1.jsp"><button type="button"
					class="btn btn-primary btn-lg px-4 me-md-2 fw-bold" >Create a account</button></a>
				<button type="button" class="btn btn-outline-secondary btn-lg px-4">More</button>
			</div>
		</div>
		<div class="col-lg-4 offset-lg-1 p-0 overflow-hidden shadow-lg">
			<img class="rounded-lg-3" src="user-mngmnt.jpg" alt="" width="450">
		</div>
	</div>



</body>
</html>