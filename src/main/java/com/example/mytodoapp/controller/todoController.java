package com.example.mytodoapp.controller;

import com.example.mytodoapp.Entity.TodoItem;
import com.example.mytodoapp.repository.TodoRepository;
import com.sun.istack.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/todo")
public class todoController {
    @Autowired
    private TodoRepository todoRepo;

    @GetMapping
    public List<TodoItem> findAll(){
        return todoRepo.findAll();
    }

    @PostMapping
    public TodoItem save(@NotNull @RequestBody TodoItem todoItem){
        return todoRepo.save(todoItem);
    }

    @PutMapping
    public TodoItem update(@NotNull @RequestBody TodoItem todoItem){
        return todoRepo.save(todoItem);
    }
    @DeleteMapping(value = "/{id}")
    public void delete(@PathVariable Long id){
        todoRepo.deleteById(id);
    }
}
