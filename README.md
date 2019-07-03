# TASKMASTER
> Deployed URL to be added

## INTRO
> It’s a task-tracking application with the same basic goal as Trello: allow users to keep track of tasks to be done and 
their status.

## API
```
    GET /tasks - Sends the user JSON data representing all of the tasks in the database.
    POST /tasks - Adds a new task to the database based on user input.
    PUT /tasks/{id}/state - Allows the user to advance the status of a task.
```

## ISSUES
   * Unable to build app due to Failed to Load Application Context exception

## CHANGELOG
   * LAB 26: Build with DynamoDB
        * COMPLETED:
            * Set up DynamoDB in AWS
            * Setup application repository.
            * Created Task model
            * Connected app to DynamoDB
        * TO BE COMPLETED:
            * Implement Feature Task 1
            * Implement Feature Task 2
            * Implement Feature Task 3
            * Implement Feature Task 4
            