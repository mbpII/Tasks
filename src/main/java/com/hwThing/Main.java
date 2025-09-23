package com.hwThing;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class Main {

    public static void main(String[] args) {
        System.out.println("Fuck it. Everything gets done !");
        Comparator<Task> taskComparator = new Comparator<Task>() {
            @Override
            public int compare(Task o1, Task o2) {
                return o2.getPriorityValue() - o1.getPriorityValue();
            }
        };

        Task task = new Task("Effective Java", "Read effective java", Priority.High);
        Task task2 = new Task("Typing Test", "Preform routine typing test to increase typing speed", Priority.Low);
        Task task3 = new Task("Leetcode", "Practice datastructures and algorithms for interviews ", Priority.Medium);
        Task task4 = new Task("Jax 3", "Get the fuck out of pack", Priority.High);

        Task[] tasks = new Task[] {task, task2, task3, task4};

        PriorityQueue<Task> q = new PriorityQueue<>(taskComparator);
        q.addAll(List.of(tasks));

        printTasks(q);
    }

    private static <T> void printTasks(PriorityQueue<T> queue) {
        for (T item : queue) {
            System.out.println(item);
        }
    }
}