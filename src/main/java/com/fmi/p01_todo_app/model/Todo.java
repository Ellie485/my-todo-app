package com.fmi.p01_todo_app.model;


import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class Todo {

    private Long id;

    @NotNull(message = "Заглавието на задачата не може да бъде null")
    @Size(min = 1, message = "Заглавието трябва да има поне 1 символ")
    private String title;

    private boolean completed;


    public Todo() {}

    public Todo(Long id, String title, boolean completed) {
        this.id = id;
        this.title = title;
        this.completed = completed;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
}