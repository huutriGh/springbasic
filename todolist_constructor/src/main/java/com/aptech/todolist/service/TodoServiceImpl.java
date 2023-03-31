package com.aptech.todolist.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aptech.todolist.model.Todo;
import com.aptech.todolist.repository.TodoRepository;


@Service("todoService")
public class TodoServiceImpl implements TodoService {

    private TodoRepository todoRepository;

    public TodoServiceImpl() {
       System.out.println("todoServiceImpl no args constructor");
    }

    @Autowired
    public TodoServiceImpl(TodoRepository todoRepository) {
        System.out.println("todoServiceImpl todoRepository constructor");

        this.todoRepository = todoRepository;

    }

    @Override
    public List<Todo> findAll() {
        return todoRepository.findAll();
    }

    @Autowired
    public void setTodoRepository(TodoRepository todoRepository) {
        System.out.println("todoServiceImpl setter");
        this.todoRepository = todoRepository;
    }

}
