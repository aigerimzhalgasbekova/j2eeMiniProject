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
				<li><a href="/logout.do"><span class="glyphicon glyphicon-log-out"></span> Logout</a></li>
			</ul>
		</div>

	</nav>

	<div class="container">
		<H1>Welcome ${name}</H1>

		Your Todos are
		<ol>
			<c:forEach items="${todos}" var="todo">
				<li>${todo.name}&nbsp;<a href="/delete-todo.do?id=${todo.id}">Delete</a></li>
			</c:forEach>
		</ol>

		<p>
			<font color="red">${errorMessage}</font>
		</p>
		<form class="form-inline" method="POST" action="/add-todo.do">
			<label for="exampleInputName2">New Todo</label>
			<input name="todo" type="text" class="form-control" id="exampleInputName2" /> <input type ="hidden" name ="id"/> <input name="add"
				type="submit" class="btn btn-default"/>
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