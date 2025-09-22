package com.hwThing;

import java.util.Comparator;

public class Task {
    String name;
    String description;
    int value;
    long creationTime;

    public Task() {
    }

    public Task(String name, String description, int value) {
        this.name = name;
        this.description = description;
        this.value = value;
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

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public long getCreationTime() {
        return creationTime;
    }

    @Override
    public String toString() {
        return "Task{name'" + name + "', description= '" + description + "', value=" + value + "}";
    }

}
