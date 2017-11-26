package com.in28minutes.todo;

import java.util.ArrayList;
import java.util.List;

public class TodoService {
	private static List<Todo> todos = new ArrayList<Todo>();

	static {
		todos.add(new Todo("Learn Web Application", "Study"));
		todos.add(new Todo("Learn Spring", "Study"));
		todos.add(new Todo("Learn Spring MVC", "Study"));
	}

	public List<Todo> retrieveTodos() {
		return todos;
	}
	
	public void add(Todo todo) {
		todos.add(todo);
	}
	
	public void delete(Todo todo) {
		todos.remove(todo);
	}
}
