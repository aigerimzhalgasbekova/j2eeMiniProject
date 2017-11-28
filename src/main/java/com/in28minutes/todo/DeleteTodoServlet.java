package com.in28minutes.todo;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * DeleteTodoServlet deletes a todo when a user clicks on "delete" in front of it
 * */

@WebServlet("/delete-todo.do")
public class DeleteTodoServlet extends HttpServlet {
private TodoService todoService = new TodoService();
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		List<Todo> list = todoService.retrieveTodos();
		
		//id is used to delete a todo from the list
		for (int i=0; i<list.size(); i++) {
			if(list.get(i).hashCode()==Integer.parseInt(request.getParameter("id"))) {
				todoService.delete(list.get(i));
				System.out.println("Test");
			}
		}
		
		response.sendRedirect("/list-todos.do");
	} 

}
