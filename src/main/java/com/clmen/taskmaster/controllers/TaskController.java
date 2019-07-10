package com.clmen.taskmaster.controllers;

import com.clmen.taskmaster.models.Task;
import com.clmen.taskmaster.repositories.TaskRepository;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;


@Controller
public class TaskController {

    @Autowired
    private TaskRepository taskRepository;

    @GetMapping("/tasks")
    @ResponseBody
    public String getTasks() {
        Iterable<Task> tasks = taskRepository.findAll();
        Gson gson = new Gson();

        return gson.toJson(tasks);
    }

    @PostMapping("/tasks")
    public String createTask(@RequestParam String title, String description) {
        Task task = new Task(title, description);

        task.setStatus(Task.Status.Available);

        taskRepository.save(task);

        return "redirect: /tasks";
    }

    @PutMapping("/tasks/{id}/state")
    public String updateTask(@PathVariable UUID id) {
        Task task = taskRepository.findById(id);

//        if (task != null && task.getStatus() != Task.Status.Finished) {
//
//        }

        switch (task.getStatus()) {
            case Available:
                task.setStatus(Task.Status.Assigned);
                taskRepository.save(task);

                return "redirect:/tasks";

            case Assigned:
                task.setStatus(Task.Status.Accepted);
                taskRepository.save(task);

                return "redirect:/tasks";

            case Accepted:
                task.setStatus(Task.Status.Finished);
                taskRepository.save(task);

                return "redirect:/tasks";
        }

        return "redirect:/tasks";
    }

}
