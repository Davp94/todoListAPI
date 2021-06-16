package com.aux161.TodoListProyect.main.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aux161.TodoListProyect.main.dao.ITodoListItemDao;
import com.aux161.TodoListProyect.main.models.TodoListItem;

@Service
public class TodoListItemServiceImpl implements ITodoListItemService{

	@Autowired
	private ITodoListItemDao  todoListItemDao;
	
	@Override
	public List<TodoListItem> findAll() {
		// TODO Auto-generated method stub
		return (List<TodoListItem>) todoListItemDao.findAll();
	}

	@Override
	public TodoListItem findById(int id) {
		// TODO Auto-generated method stub
		return todoListItemDao.findById(id).orElse(null);
	}

	@Override
	public TodoListItem save(TodoListItem item) {
		// TODO Auto-generated method stub
		return todoListItemDao.save(item);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		todoListItemDao.deleteById(id);
	}

	@Override
	public List<TodoListItem> findByEstadoTrue() {
		// TODO Auto-generated method stub
		return todoListItemDao.findByEstadoTrue();
	}

}
