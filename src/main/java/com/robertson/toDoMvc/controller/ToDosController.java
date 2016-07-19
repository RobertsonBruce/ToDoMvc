package com.robertson.toDoMvc.controller;

import com.robertson.toDoMvc.model.ToDoItem;
import com.robertson.toDoMvc.repository.ToDoItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/todos")
public class ToDosController {
    @Autowired
    private ToDoItemRepository toDoItemRepository;

    @RequestMapping
    public Collection<ToDoItem> getAllToDoItems() {
        return toDoItemRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.POST)
    public void addToDoItem(@RequestBody ToDoItem toDoItem) {
        toDoItemRepository.save(toDoItem);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteToDoItem(@PathVariable Long id) {
        toDoItemRepository.delete(id);

    }

    @RequestMapping(method = RequestMethod.PATCH)
    public void updateToDoItem(@RequestBody ToDoItem toDoItem) {
        toDoItemRepository.save(toDoItem);
    }

}


