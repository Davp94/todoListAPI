package com.aux161.TodoListProyect.main.services;

import java.util.List;

import com.aux161.TodoListProyect.main.models.TodoListItem;

public interface ITodoListItemService {
	
	public List<TodoListItem> findAll();
	
	public TodoListItem findById(int id);
	
	public TodoListItem save(TodoListItem item);
	
	public void delete(int id);
	
	public List<TodoListItem> findByEstadoTrue();

}
