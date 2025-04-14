
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Course  {

//     Course Class

// Fields: courseName, students (list of students).
// Methods:
// addStudent(Student student) → Adds a student to the course.
// showAllStudents() → Displays all students in the course.
Scanner sc=new Scanner(System.in);
public String courseName;
public List<Student> students=new ArrayList<>();
public void addStudent(Student student){

    students.add(student);
   
    }
   void showAllStudents(){
    System.out.println("\nCourse: " + courseName);
    for (Student student : students) {
        student.displayInfo();
    }

        
    }


   }





