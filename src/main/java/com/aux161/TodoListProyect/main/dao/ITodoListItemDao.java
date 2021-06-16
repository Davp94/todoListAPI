package com.aux161.TodoListProyect.main.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.aux161.TodoListProyect.main.models.TodoListItem;

public interface ITodoListItemDao extends CrudRepository<TodoListItem, Integer>{

	@Query(value = "select * from todo_list_item where estado = 1",nativeQuery = true)
	public List<TodoListItem> desplegarTareasRealizadas(); 
	
	//Como nuestro modelo es un valor booleano era comparar con TRUE
	public List<TodoListItem> findByEstadoTrue();
	
	
	
}
