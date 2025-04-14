package collections.framework;


import java.util.ArrayList;

public class LearnArrayList {
    public static void main(String[] args) {
        ArrayList<String> studentNames=new ArrayList<>();
        studentNames.add("Hamza");
        studentNames.add("Saman");
        studentNames.add("Sulaiman");
        studentNames.add("Hanzalah");
        studentNames.add("Mariyum");
        studentNames.add("Jaweria");
        System.out.println(studentNames);
        studentNames.remove(1);
        System.out.println(studentNames);
        



        
    }
//     1️⃣ Task: Working with ArrayList
// 🔹 Problem:

// Create an ArrayList of Student Names.
// Add 5 names to the list.
// Remove the 2nd name from the list.
// Print the list before and after removing the name.
// 💡 Hint: Use .add() to insert and .remove(index) to delete.



}
