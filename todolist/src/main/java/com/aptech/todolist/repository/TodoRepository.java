package com.aptech.todolist.repository;

import java.util.List;

import com.aptech.todolist.model.Todo;

public interface TodoRepository {
    
    public List<Todo> findAll();
    
    
}
