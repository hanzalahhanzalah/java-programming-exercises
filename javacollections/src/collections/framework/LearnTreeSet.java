package collections.framework;

import java.util.TreeSet;

public class LearnTreeSet {
    public static void main(String[] args) {

TreeSet<Integer> examsScores=new TreeSet<>();
examsScores.add(32);
examsScores.add(34);
examsScores.add(59);
examsScores.add(90);
examsScores.add(79);
System.out.println(examsScores);
    }
}

// 4️⃣ Task: TreeSet for Sorted Data
// 🔹 Problem:

// Create a TreeSet<Integer> to store exam scores.
// Add 5 random numbers (e.g., 85, 60, 90, 75, 80).
// Print the sorted list of scores.
// 💡 Hint: TreeSet automatically sorts the elements.