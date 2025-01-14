<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<%@ include file ="components1/bootstrap.jsp" %>
<style type="text/css">

.paint-card{
box-shadow: 0 0 10px 0 rgba(0,0,0,0.3);

}
</style>
</head>
<body>
<%@ include file="components1/navbar.jsp" %>


<div class="container p-5 ">
		<div class="row">
			<div class="col-md-4 offset-md-4">
				<div class="car paint-card" >
					<div class="card-body">
					<p class="fs-4 text-center">User Registration</p>
						<form action="register" method="post">
						<% String msg =(String)session.getAttribute("msg");
						
						if(msg!=null){
							%>
							<h4 class="text-success text-center"><%=msg %></h4>
							<% 
						}
						
						session.removeAttribute("msg");
						
						%>
						<% String msg1 =(String)request.getAttribute("msg1");
						
						if(msg1!=null){
							%>
							<h3 class="text-success"><%=msg1 %></h3>
							<% 
						}
						
						request.removeAttribute("msg1");
						
						%>
							<div class="mb-3">
								<label class="form-label">Name</label>
								<input name="name" type="text" class="form-control" required>					
							</div>
							<div class="mb-3">
								<label class="form-label">Age</label>
								<input name="age" type="text" class="form-control" required>					
							</div>
							<div class="mb-3">
								<label class="form-label">Mobile</label>
								<input name="mobile" type="text" class="form-control" required>					
							</div>
							<div class="mb-3">
								<label class="form-label">Email Address</label>
								<input name="email" type="email" class="form-control" required>					
							</div>
							<div class="mb-3">
								<label class="form-label">Password</label>
								<input name="password" type="password" class="form-control" required>					
							</div>
							<button type="submit" class="btn bg-secondary text-white col-md-12">Register</button>
						</form>
					
					</div>
				</div>
			</div>
		</div>
	</div>


</body>
</html>