<%@ include file="../common/header.jspf" %>
	<%@ include file="../common/navigation.jspf" %>

	<div class="container">
		<H1>Welcome ${name}</H1>

		<table class="table table-striped" >
		<caption> Your Todos are </caption>
			<thead>
				<tr>
					<th>Description</th>
					<th>Category</th>
					<th>Action</th>
				</tr>
			</thead>
				
			<tbody>
			<c:forEach items="${todos}" var="todo">
				<tr>
					<td>${todo.name}</td>
					<td>${todo.category}</td>
					<td><a class="btn btn-danger" href="/delete-todo.do?id=${todo.id}">Delete</a></td>
				</tr>
			</c:forEach>
			</tbody>
		</table>

		<p>
			<font color="red">${errorMessage}</font>
		</p>
		<a class="btn btn-success" href="/add-todo.do">Add New Todo</a>
	</div>

	<%@ include file="../common/footer.jspf" %>
	