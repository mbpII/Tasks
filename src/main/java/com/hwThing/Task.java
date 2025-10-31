package com.hwThing;

public record Task(String name, String description, Priority priorityValue, long creationTime) {
     Task(String name, String description, Priority priorityValue) {
         this(name, description, priorityValue, System.currentTimeMillis());
    }
};
