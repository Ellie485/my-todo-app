package com.fmi.p01_todo_app.service;


import com.fmi.p01_todo_app.model.Todo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class TodoService {

    private List<Todo> todos = new ArrayList<>();
    private Long nextId = 1L;

    // добавяне
    public Todo createTodo(Todo todo) {
        todo.setId(nextId++);
        todos.add(todo);
        return todo;
    }

    // намиране на вс задачи
    public List<Todo> getAllTodos() {
        return todos;
    }

    // намиране  по ID
    public Optional<Todo> getTodoById(Long id) {
        return todos.stream().filter(todo -> todo.getId().equals(id)).findFirst();
    }

    // обновяване
    public Todo updateTodo(Long id, Todo updatedTodo) {
        Optional<Todo> todoOptional = getTodoById(id);
        if (todoOptional.isPresent()) {
            Todo todo = todoOptional.get();
            todo.setTitle(updatedTodo.getTitle());
            todo.setCompleted(updatedTodo.isCompleted());
            return todo;
        }
        return null;
    }

    // изтриване
    public boolean deleteTodo(Long id) {
        return todos.removeIf(todo -> todo.getId().equals(id));
    }
}