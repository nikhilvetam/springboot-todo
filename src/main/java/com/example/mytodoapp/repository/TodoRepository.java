package com.example.mytodoapp.repository;

import com.example.mytodoapp.Entity.TodoItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<TodoItem,Long> {
}
