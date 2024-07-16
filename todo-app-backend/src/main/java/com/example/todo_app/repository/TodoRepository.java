package com.example.todo_app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.todo_app.entity.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long> {
	
	@Query("SELECT MAX(t.id) FROM Todo t")
    Long findMaxId();

}
