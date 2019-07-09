package com.clmen.taskmaster.repositories;

import com.clmen.taskmaster.models.Task;
import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;
import java.util.UUID;

@EnableScan
public interface TaskRepository extends CrudRepository<Task, Integer> {
    @EnableScan
    Iterable<Task> findAll();

    Task findById(UUID id);
}

