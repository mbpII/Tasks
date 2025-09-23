package com.hwThing;

public class Task {
    private String name;
    private String description;
    private Priority priorityValue;
    private long creationTime;

    public Task() {
    }

    public Task(String name, String description, Priority importance) {
        this.name = name;
        this.description = description;
        this.priorityValue = importance;
        this.creationTime = System.currentTimeMillis();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getCreationTime() {
        return creationTime;
    }

    public int getPriorityValue() {
        return priorityValue.getImportance();
    }

    @Override
    public String toString() {
        return "Task{name'" + name + "', description= '" + description + "', Priority=" + priorityValue + "}";
    }

}
