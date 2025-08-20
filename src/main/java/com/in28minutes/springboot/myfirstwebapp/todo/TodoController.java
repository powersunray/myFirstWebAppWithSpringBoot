package com.in28minutes.springboot.myfirstwebapp.todo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class TodoController {
    private TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @GetMapping(value="/todo-list")
    public String listAllTodos(ModelMap model) {
        List<Todo> todos = todoService.findByUsername("vietnam");
        model.addAttribute("todos", todos);
        return "todos";
    }
}
