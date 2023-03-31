package com.aptech.todolist.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.aptech.todolist.model.Todo;
import com.aptech.todolist.service.TodoService;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class TodoController {

    @Autowired
    private TodoService service;

    @GetMapping(path = "/todolist")

    public ResponseEntity<List<Todo>> getAllTodoList() {

        List<Todo> todos = service.findAll();

        return new ResponseEntity<List<Todo>>(todos, HttpStatus.OK);
    }

    @PostMapping(path = "/addTodo", consumes = { MediaType.APPLICATION_JSON_VALUE }, produces = {
            MediaType.APPLICATION_JSON_VALUE })
    public ResponseEntity<Todo> addTodo(@RequestBody Todo todo) {

        return new ResponseEntity<>(todo, HttpStatus.CREATED);
    }

}
