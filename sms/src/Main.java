public class Main {
    public static void main(String[] args)  {

//         Main Class (StudentManagementSystem)

// Create at least 3 students and 1 course.
// Add students to the course.
// Display all students and their average marks.
Student s=new Student();
s.name="hamza";
s.studentID=6059;
s.grades[0]=50;
s.grades[1]=54;
s.grades[2]=58;
s.grades[3]=45;
s.grades[4]=70;
s.calculateAverage();
s.displayInfo();
Student v=new Student();
v.name="ghuman";
v.studentID=6039;
v.grades[0]=57;
v.grades[1]=54;
v.grades[2]=57;
v.grades[3]=45;
v.grades[4]=90;
v.calculateAverage();
v.displayInfo();
Student u=new Student();
u.name="ilyas";
u.studentID=6019;
u.grades[0]=40;
u.grades[1]=84;
u.grades[2]=58;
u.grades[3]=95;
u.grades[4]=70;
u.calculateAverage();
u.displayInfo();
Course c=new Course();
c.courseName="pst";
c.addStudent(s);
c.addStudent(v);
c.addStudent(u);
c.showAllStudents();


    }
}
//result
// Student: Alice (ID: 101) - Average: 85.0
// Student: Bob (ID: 102) - Average: 78.5
// Student: Charlie (ID: 103) - Average: 90.0
