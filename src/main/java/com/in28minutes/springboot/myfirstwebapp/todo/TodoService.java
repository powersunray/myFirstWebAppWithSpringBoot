package com.in28minutes.springboot.myfirstwebapp.todo;

import java.time.LocalDate;
import java.util.List;

public class TodoService {
    private static List<Todo> todos;
    static {
        todos.add(new Todo(1, "vietnam", "Learn Spring Boot",
                LocalDate.now().plusMonths(6), false));
        todos.add(new Todo(2, "vietnam", "Learn DSA",
                LocalDate.now().plusMonths(7), false));
        todos.add(new Todo(23, "vietnam", "Learn DevOps",
                LocalDate.now().plusMonths(12), false));
    }

    public List<Todo> findByUsername(String username) {
        return todos;
    }
}
