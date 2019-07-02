package com.clmen.taskmaster.models;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

import java.util.UUID;

@DynamoDBTable(tableName = "Tasks")
public class Task {
/************
 * Instance Variables
 * */
    private UUID id;
    private String title;
    private String description;
    private Status status;

/************
 * Constructors
 * */
    public Task() {}

    public Task(String t, String d) {
        this.title = t;
        this.description = d;
        this.status = Status.Available;
    }


/************
 * Getters/Setters
 * */
    public UUID getId() { return id; }
    public String getTitle() { return title; }
    public String getDescription() { return description; }
    public Status getStatus() { return status; }

    public void setTitle(String title) { this.title = title; }
    public void setDescription(String description) { this.description = description; }
    public void setStatus(Status status) { this.status = status; }


/************
 * Enum
 * */
    public enum Status {
        Available, Assigned, Accepted, Finished
    }
}
