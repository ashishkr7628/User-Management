<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<%@ include file ="components1/bootstrap.jsp" %>
</head>
<body>





<h1 class="text-success">Are you sure, you want to delete permanately</h1>

<a class="btn btn-success text-decoration-none" href="delete?id=<%=request.getParameter("id") %>">Yes</a>
<a class="btn btn-danger text-decoration-none" href="home1.jsp">No</a>




</body>
</html>