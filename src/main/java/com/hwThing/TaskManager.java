package com.hwThing;

import java.util.Comparator;
import java.util.PriorityQueue;

interface TaskManager {
        boolean add(Task task);
        Task remove();
}
