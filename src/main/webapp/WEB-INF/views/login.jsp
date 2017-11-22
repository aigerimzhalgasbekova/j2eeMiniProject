<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>

<head>
<title>Yahoo!!!</title>
<!-- Bootstrap core CSS -->
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
	rel="stylesheet">

<style>
.footer {
	position: absolute;
	bottom: 0;
	width: 100%;
	height: 60px;
	background-color: #f5f5f5;
}

.footer .container {
	width: auto;
	max-width: 680px;
	padding: 0 15px;
}

.form-control{
	width: 30%;
}
</style>
</head>

<body>

	<nav role="navigation" class="navbar navbar-inverse">

		<div class="">
			<a href="/" class="navbar-brand">J2EE</a>
		</div>

		<div class="navbar-collapse">
			<ul class="nav navbar-nav">
				<li class="active"><a href="#">Home</a></li>
				<li><a href="/list-todo.do">Todos</a></li>
				<li><a href="https://www.linkedin.com/in/azhalgasbekova/">LinkedIn</a></li>
			</ul>
			<ul class="nav navbar-nav navbar-right">
				<li><a href="/login.do"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
			</ul>
		</div>

	</nav>

	<div class="container">
		<form action="/login.do" method="post">
			<p><font color="red">${errorMessage}</font></p>
			<div class="form-group">
				<label for="exampleInputEmail1">User Name</label> 
				<input
					type="text" class="form-control" id="exampleInputEmail1"
					placeholder="Name" name="name">
			</div>
			<div class="form-group">
				<label for="exampleInputPassword1">Password</label> <input
					type="password" class="form-control" id="exampleInputPassword1"
					placeholder="Password" name="password">
			</div>
			<!-- Name: <input type="text" name="name"/>
			Password: <input type="password" name="password"/> -->
			<input type="submit" class="btn btn-primary" value="Login"/>
		</form>
	</div>

	<footer class="footer">
		<div class="container">
			<p>Aigerim Zhalgasbekova</p>
		</div>
	</footer>

	<script src="webjars/jquery/3.2.1/jquery.min.js"></script>
	<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>

</body>

</html>
