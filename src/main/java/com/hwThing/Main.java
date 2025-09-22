package com.hwThing;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Main {

    public static void main(String[] args) {
        System.out.println("Fuck it. Everything gets done !");

        Comparator<Task> taskPriority = (t1, t2) -> {
            int priority = Integer.compare(t1.getValue(), t2.getValue());
            if (priority == 0) {
                return Long.compare(t1.getCreationTime(), t2.getCreationTime());
            }
            return priority;
        };

        PriorityQueue<Task> q = new PriorityQueue<>(taskPriority);

        Task item1 = new Task();
        item1.setName("Quiz");
        item1.setValue(4);
        item1.setDescription("My professor is a godsend he let me retake that quiz");
        q.add(item1);

        Task item2 = new Task();
        item2.setName("Java Stuff");
        item2.setValue(3);
        item2.setDescription("Making sure that I get my reps in with java");
        q.add(item2);

        Task item3 = new Task();
        item3.setName("Researching new iphone");
        item3.setValue(2);
        item3.setDescription("Feels like I need a new iphone probably should wait for next year, but I've already waited so i'm getting impaitiend");
        q.add(item3);

        Task item4 = new Task();
        item4.setName("Extra Credit");
        item4.setValue(4);
        item4.setDescription("My federal gov professor is giving extra credit if we research Bograms find out if we left any weapons");
        q.add(item4);

        System.out.println(q);
    }
}

