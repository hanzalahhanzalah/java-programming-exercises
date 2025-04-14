

public class Student {
//     Student Class

// Fields: name, studentID, grades (array of marks).
// Methods:
// calculateAverage() → Returns the student’s average marks.
// displayInfo() → Displays student details.
public String name;
public int studentID;
public int[] grades=new int[5];

public double  calculateAverage(){
int sum=0;    
for (int i = 0; i < grades.length; i++) {
    sum=sum+grades[i];}
 return(double)sum/grades.length;
  
}
public void displayInfo(){
    System.out.println("Student_Name: "+name+" ,"+"Student_ID: " +studentID +
    " ,"+"Average_marks: "+ calculateAverage());
}


}
