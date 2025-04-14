package collections.framework;

import java.util.PriorityQueue;

public class LearnPriorityQueue {
    public static void main(String[] args) {
PriorityQueue<Integer> tasks=new PriorityQueue<>();
tasks.add(10);
tasks.add(9);
tasks.add(8);
tasks.add(7);
tasks.add(6);
tasks.add(5);
tasks.add(4);
tasks.add(3);
tasks.add(2);
tasks.add(1);
System.out.println(tasks);
tasks.poll();
System.out.println(tasks);
    }
    
}

// 6️⃣ Task: PriorityQueue for Task Scheduling
// 🔹 Problem:

// Create a PriorityQueue<Integer> for task priorities.
// Add tasks with priorities (1 = highest, 10 = lowest).
// Remove and print tasks in priority order.
// 💡 Hint: Use .poll() to remove elements in priority order.