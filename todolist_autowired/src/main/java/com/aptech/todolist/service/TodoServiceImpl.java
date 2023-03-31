package com.aptech.todolist.service;

import java.util.List;

import com.aptech.todolist.model.Todo;
import com.aptech.todolist.repository.TodoRepository;

public class TodoServiceImpl implements TodoService {

    private TodoRepository todoRepository;

    public TodoServiceImpl(TodoRepository todoRepository) {

        this.todoRepository = todoRepository;

    }

    @Override
    public List<Todo> findAll() {
        return todoRepository.findAll();
    }

    public void setTodoRepository(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

}
