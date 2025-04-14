package collections.framework;

import java.util.LinkedList;

public class LearnLinkedList {
    public static void main(String[] args) {
LinkedList<String> toDoList=new LinkedList<>();
toDoList.addFirst("coding");
toDoList.addFirst("sleep");
toDoList.addFirst("wakeing");
System.out.println(toDoList);
toDoList.addLast("prayer");
toDoList.addLast("arabic");
System.out.println(toDoList);
toDoList.removeFirst();
System.out.println(toDoList);

        
    }
    
}
// 🔹 Problem:2️⃣ Task: Using LinkedList for Tasks

// Use a LinkedList<String> to store tasks in a To-Do List.
// Add 3 tasks at the beginning using .addFirst().
// Add 2 tasks at the end using .addLast().
// Remove the first task after completing it.
// Print the remaining tasks.
// 💡 Hint: Use .addFirst(), .addLast(), and .removeFirst().

