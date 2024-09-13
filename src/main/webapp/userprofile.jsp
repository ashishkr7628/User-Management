<%@page import="com.org.dto.User"%>
<%@page import="com.org.dao.UserDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<%@ include file="components1/bootstrap.jsp"%>
<style type="text/css">
.paint-card {
	box-shadow: 0 0 10px 0 rgba(0, 0, 0, 0.3);
}
</style>
</head>
<body>

	<%@ include file="components1/homeNav.jsp"%>
	<div class="container p-5 ">
		<div class="row">
			<div class="col-md-4 offset-md-4">
				<div class="car paint-card">
					<div class="card-body">
						<%
	User sessionUser = (User) session.getAttribute("userObj");
	if (sessionUser == null) {
		response.sendRedirect("login1.jsp");
	} else{
		
	%>
	<% int id =Integer.parseInt(request.getParameter("id")) ;
					
					UserDao dao = new UserDao();
					
					User user=dao.fetchUserById(id);
					
					%>

						<p class="fs-4 text-center"><%=user.getName() %> Profile</p>


						
						<form action="update" method="post">

							<div class="mb-3">
								<label class="form-label">Name</label> <input name="name"
									type="text" class="form-control" value="<%= user.getName()%>"
									required>
							</div>
							<div class="mb-3">
								<label class="form-label">Age</label> <input name="age"
									type="text" class="form-control" value="<%= user.getAge()%>"
									required>
							</div>
							<div class="mb-3">
								<label class="form-label">Mobile</label> <input name="mobile"
									type="text" class="form-control" value="<%= user.getMobile()%>"
									required>
							</div>
							<div class="mb-3">
								<label class="form-label">Email Address</label> <input
									name="email" type="email" class="form-control"
									value="<%= user.getEmail()%>" required>
							</div>

							<input name="id" type="hidden" class="form-control"
								value="<%=user.getId() %>" required>
								
								<%
								}
								%>

							<button type="submit"
								class="btn bg-secondary text-white col-md-12">Update</button>
						</form>

					</div>
				</div>
			</div>
		</div>
	</div>




</body>
</html>