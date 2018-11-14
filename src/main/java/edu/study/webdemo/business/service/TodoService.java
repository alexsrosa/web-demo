package edu.study.webdemo.business.service;

import edu.study.webdemo.persistence.dao.Dao;
import edu.study.webdemo.persistence.model.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Collection;

@Scope(value = "session")
@Component(value = "todoService")
public class TodoService {

    @Autowired
    private Dao<Todo> todoDao;
    private Todo todo = new Todo();

    public void save() {
        todoDao.save(todo);
        todo = new Todo();
    }

    public Collection<Todo> getAllTodo() {
        return todoDao.getAll();
    }

    public int saveTodo(Todo todo) {
        validate(todo);
        return todoDao.save(todo);
    }

    private void validate(Todo todo) {
        // Details omitted
    }

    public Todo getTodo() {
        return todo;
    }
}