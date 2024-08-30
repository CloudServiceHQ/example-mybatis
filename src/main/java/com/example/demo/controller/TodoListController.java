package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.demo.service.TodoListService;

@Controller
@RequestMapping("/")
public class TodoListController {
    private final TodoListService todoListService;

    public TodoListController(TodoListService todoListService){
        this.todoListService = todoListService;
    }

    @RequestMapping("/")
    public String getTodoList(Model model){
        model.addAttribute("todoList", todoListService.getAllTodoList());
        return "index";
    }
}
