package com.robertson.toDoMvc.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class ToDoItem implements Serializable {
    @Id
    @GeneratedValue
    private Long id;
    private String task;
    private boolean completed;

    public ToDoItem() {
    }

    public ToDoItem(Long id,String task, boolean completed) {
        this.id = id;
        this.task = task;
        this.completed = completed;
    }

    public ToDoItem(String task) {
        this.task = task;
    }

    public Long getId() {
        return id;
    }


    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
}
