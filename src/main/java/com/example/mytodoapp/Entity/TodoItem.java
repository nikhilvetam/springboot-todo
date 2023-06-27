package com.example.mytodoapp.Entity;

import com.sun.istack.NotNull;
import org.springframework.lang.NonNull;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class TodoItem {
    private Long id;
    @NotNull
    private String taskName;
    private int completionDays;
    private boolean completed;

    public TodoItem() {

    }

    public TodoItem(Long id, String taskName, int completionDays, boolean completed) {
        this.id = id;
        this.taskName = taskName;
        this.completionDays = completionDays;
        this.completed = completed;
    }
    @Id
    @GeneratedValue
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public int getCompletionDays() {
        return completionDays;
    }

    public void setCompletionDays(int completionDays) {
        this.completionDays = completionDays;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
}
