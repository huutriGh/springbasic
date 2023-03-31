package com.aptech.todolist;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.aptech.todolist.service.TodoService;

@SpringBootApplication
public class TodolistApplication {

	public static void main(String[] args) {
		var context = SpringApplication.run(TodolistApplication.class, args);
		TodoService service = context.getBean("todoService", TodoService.class);
		System.out.println(service);
	}

}
