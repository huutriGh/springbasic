package com.aptech.todolist.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.aptech.todolist.repository.TodoRepository;
import com.aptech.todolist.repository.TodoRepositoryImpl;
import com.aptech.todolist.service.TodoService;
import com.aptech.todolist.service.TodoServiceImpl;

@Configuration
public class AppConfig {

    @Bean(name = "todoService")
    public TodoService getTodoService() {
       TodoServiceImpl  todoServiceImpl = new TodoServiceImpl();
       todoServiceImpl.setTodoRepository(getTodoRepository());
       return todoServiceImpl;
    }

    @Bean(name = "todoRepository")
    public TodoRepository getTodoRepository() {
        return new TodoRepositoryImpl();
    }

}
