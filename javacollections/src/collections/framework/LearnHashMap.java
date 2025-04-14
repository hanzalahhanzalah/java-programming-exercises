package collections.framework;

import java.util.HashMap;

public class LearnHashMap {
    public static void main(String[] args) {
 HashMap<String,Integer> namesAndMarks=new HashMap<>();
 namesAndMarks.put("Hanzalah", 90);
 namesAndMarks.put("Saman", 80);
 namesAndMarks.put("Hamza", 70); 
 System.out.println(namesAndMarks.keySet());  
 System.out.println(namesAndMarks.values()); 
 System.out.println(namesAndMarks.get("Saman"));
    }
}

// 5️⃣ Task: HashMap for Student Grades
// 🔹 Problem:

// Use a HashMap<String, Integer> to store Student Names & Marks.
// Add 3 students and their marks.
// Print all the keys (names) and values (marks) separately.
// Find and print the marks of a specific student (e.g., "Ali").
// 💡 Hint: Use .put(), .keySet(), and .get("Ali").
