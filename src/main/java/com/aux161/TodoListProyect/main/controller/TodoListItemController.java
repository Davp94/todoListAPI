package com.aux161.TodoListProyect.main.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aux161.TodoListProyect.main.models.TodoListItem;
import com.aux161.TodoListProyect.main.services.ITodoListItemService;

@RestController
@RequestMapping("/todoList")
public class TodoListItemController {
	
	@Autowired
	public ITodoListItemService todoListItemService;
	
	@GetMapping("/tareas")
	public List<TodoListItem> items(){
		return todoListItemService.findAll();
	}
	
	//Path variable indica que es un parametro que recibira
	@GetMapping("/tareas/{id}")
	public TodoListItem findById(@PathVariable int id){
		return todoListItemService.findById(id);
	}
	
	@GetMapping("/tareas/realizadas")
	public List<TodoListItem> tareasRealizadas(){
		return todoListItemService.findByEstadoTrue();
	}
	
	//Crea una nueva tarea
	//@RequestBody da el espacio para recibir los datos 
	@PostMapping("/tareas")
	public TodoListItem crearTarea(@RequestBody TodoListItem item) {
		
		TodoListItem todoListItem = todoListItemService.save(item);
		return todoListItem;
	}
	
	//Emilinar una tarea
	@DeleteMapping("/tareas/{id}")
	public void delete(@PathVariable int id) {
		//Primero buscamos la tarea por id
		TodoListItem todoListItem = todoListItemService.findById(id);
		
		//eliminamos la tarea que tenga ese ID
		todoListItemService.delete(id);
			
	}
	
	
	
	
}
