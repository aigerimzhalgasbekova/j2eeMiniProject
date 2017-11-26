<%@ include file="../common/header.jspf" %>

	<nav role="navigation" class="navbar navbar-inverse">

		<div class="">
			<a href="/" class="navbar-brand">J2EE</a>
		</div>

		<div class="navbar-collapse">
			<ul class="nav navbar-nav">
				<li class="active"><a href="#">Home</a></li>
				<li><a href="/list-todos.do">Todos</a></li>
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

	<%@ include file="../common/footer.jspf" %>
	