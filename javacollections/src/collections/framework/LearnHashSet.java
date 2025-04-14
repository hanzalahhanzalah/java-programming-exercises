package collections.framework;

import java.util.HashSet;

public class LearnHashSet {
    public static void main(String[] args) {
HashSet<Integer> stdRollNo=new HashSet<>();
stdRollNo.add(34);
stdRollNo.add(59);
stdRollNo.add(79);
stdRollNo.add(59);
stdRollNo.add(90);
System.out.println(stdRollNo);
    }
    
}

// 🔹 Problem:3️⃣ Task: HashSet for Unique Items

// Create a HashSet<Integer> to store student roll numbers.
// Add 5 roll numbers (include a duplicate number).
// Print the set and check if the duplicate was stored.
// 💡 Hint: Use .add(), HashSet removes duplicates automatically.
