package com.clmen.taskmaster.models;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAutoGeneratedKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
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
    @DynamoDBHashKey
    @DynamoDBAutoGeneratedKey
    public UUID getId() { return id; }

    @DynamoDBAttribute
    public String getTitle() { return title; }

    @DynamoDBAttribute
    public String getDescription() { return description; }

    @DynamoDBAttribute
    public Status getStatus() { return status; }

    public void setId(UUID id) { this.id = id; }
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
