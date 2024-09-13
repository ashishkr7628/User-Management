<%@page import="com.org.dto.User"%>
<nav class="navbar navbar-expand-lg navbar-dark bg-secondary">
	<div class="container-fluid">
		<a class="navbar-brand" href="index.jsp">Management-System</a> <a
			class="navbar-brand" href="home1.jsp">Home</a>
		<form class="d-flex" action="search.jsp">
			<input class="form-control me-2" type="search" placeholder="Search"
				aria-label="Search" name="val">
			<button class="btn btn-outline-success bg-primary " type="submit">Search</button>
		</form>
		<button class="navbar-toggler" type="button" data-bs-toggle="collapse"
			data-bs-target="#navbarSupportedContent"
			aria-controls="navbarSupportedContent" aria-expanded="false"
			aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="navbarSupportedContent">
			<ul class="navbar-nav ms-auto mb-2 mb-lg-0">

				<%
				User user1 = (User) session.getAttribute("userObj");
				%>
				<li class="nav-item"><a class="nav-link active"
					aria-current="page" href="userprofile.jsp?id=<%=user1.getId()%>">Profile</a></li>

				<li class="nav-item"><a class="nav-link active"
					aria-current="page" href="logout">Logout</a></li>
			</ul>

		</div>
	</div>
</nav>
