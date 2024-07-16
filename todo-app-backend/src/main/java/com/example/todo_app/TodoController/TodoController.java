package com.example.todo_app.TodoController;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.todo_app.TodoDto.TodoDto;
import com.example.todo_app.Todoservice.TodoService;

@RestController
@RequestMapping("api/todos")
public class TodoController {

	 private TodoService todoService;

	    public TodoController(TodoService todoService) {
		super();
		this.todoService = todoService;
	}

		// Build Add Todo REST API

	    @PostMapping
	    public ResponseEntity<TodoDto> addTodo(@RequestBody TodoDto todoDto){

	        TodoDto savedTodo = todoService.addTodo(todoDto);

	        return new ResponseEntity<>(savedTodo, HttpStatus.CREATED);
	    }

	    // Build Get Todo REST API
	    @GetMapping("{id}")
	    public ResponseEntity<TodoDto> getTodo(@PathVariable("id") Long todoId){
	        TodoDto todoDto = todoService.getTodo(todoId);
	        return new ResponseEntity<>(todoDto, HttpStatus.OK);
	    }

	    // Build Get All Todos REST API
	    @GetMapping
	    public ResponseEntity<List<TodoDto>> getAllTodos(){
	        List<TodoDto> todos = todoService.getAllTodos();
	        //return new ResponseEntity<>(todos, HttpStatus.OK);
	        return ResponseEntity.ok(todos);
	    }

	    // Build Update Todo REST API
	    @PutMapping("{id}")
	    public ResponseEntity<TodoDto> updateTodo(@RequestBody TodoDto todoDto, @PathVariable("id") Long todoId){
	        TodoDto updatedTodo = todoService.updateTodo(todoDto, todoId);
	        return ResponseEntity.ok(updatedTodo);
	    }

	    // Build Delete Todo REST API
	    @DeleteMapping("{id}")
	    public ResponseEntity<String> deleteTodo(@PathVariable("id") Long todoId){
	        todoService.deleteTodo(todoId);
	        return ResponseEntity.ok("Todo deleted successfully!.");
	    }

	    // Build Complete Todo REST API
	    @PatchMapping("{id}/complete")
	    public ResponseEntity<TodoDto> completeTodo(@PathVariable("id") Long todoId){
	        TodoDto updatedTodo = todoService.completeTodo(todoId);
	        return ResponseEntity.ok(updatedTodo);
	    }

	    // Build In Complete Todo REST API
	    @PatchMapping("{id}/in-complete")
	    public ResponseEntity<TodoDto> inCompleteTodo(@PathVariable("id") Long todoId){
	        TodoDto updatedTodo = todoService.inCompleteTodo(todoId);
	        return ResponseEntity.ok(updatedTodo);
	    }
	
}