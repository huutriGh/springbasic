package com.aptech.todolist.repository;

import java.util.ArrayList;
import java.util.List;

import com.aptech.todolist.model.Todo;

public class TodoRepositoryImpl implements TodoRepository {

    @Override
    public List<Todo> findAll() {

        ArrayList<Todo> arrayList = new ArrayList<>();

        Todo todo = new Todo();
        todo.setId("SPRING").setTitle("Learning Spring boot");
        arrayList.add(todo);
        todo = new Todo().setId("REACT").setTitle("Learing React");
        arrayList.add(todo);
        todo = new Todo().setId("WEB").setTitle("Build website using Spring + React");
        arrayList.add(todo);

        return arrayList;

    }

}
