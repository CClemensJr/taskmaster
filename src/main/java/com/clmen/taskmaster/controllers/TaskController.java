package com.clmen.taskmaster.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

@RestController
@Controller
public class TaskController {
    @GetMapping("/tasks")
    @ResponseBody
    public String getTasks() {
        return null;
    }


//    @PostMapping("/tasks")
//    public RedirectView addTask
}
