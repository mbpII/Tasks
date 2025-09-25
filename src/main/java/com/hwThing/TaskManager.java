package com.hwThing;

import java.util.Comparator;
import java.util.PriorityQueue;

public class TaskManager {
    public static PriorityQueue<Task>    taskQueue;

    public TaskManager() {
    }

    public boolean add(Task task) {
        // add error handling
        return taskQueue.offer(task);
    }

    public void done(Task task) {

    }

    Comparator<Task> taskComparator = (o1, o2) -> o2.getPriorityValue() - o1.getPriorityValue();
}
