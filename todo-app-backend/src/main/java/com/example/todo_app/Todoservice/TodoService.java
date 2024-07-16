package com.example.todo_app.Todoservice;

import java.util.List;

import com.example.todo_app.TodoDto.TodoDto;

public interface TodoService {

	TodoDto addTodo(TodoDto todoDto);

    TodoDto getTodo(Long id);

    List<TodoDto> getAllTodos();

    TodoDto updateTodo(TodoDto todoDto, Long id);

    void deleteTodo(Long id);

    TodoDto completeTodo(Long id);

    TodoDto inCompleteTodo(Long id);
	
}
