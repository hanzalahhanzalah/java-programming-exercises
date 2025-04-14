 /*class Pen{
    String color;
    String type; //ballpoint'
    public void write(){
        System.out.println("can write anything");
    }
    public void printcolor(){
        System.out.println(this.color);
    }
}
public class Main {
    public static void main(String args[]){

Pen pen1=new Pen ();

pen1.color ="blue";
pen1.type="gel";
pen1.write();
pen1.printcolor();

Pen pen2=new Pen();
pen2.color="black";
        pen2.type="ball";
        pen2.printcolor();
        pen2.write();



    }
}*/
 /*//contructors
 class Student{
     String name;
     int age;
     public void info(){
         System.out.println(this.name);
         System.out.println(this.age);

     }
     Student(){
         System.out.println("constructor called"); // non parametrized constructor
     }
 }

 public class Main {
     public static void main (String args[]){
         Student s1=new Student();
         s1.name="hanzalah";
         s1.age=20;
         s1.info();
     }
}*/

 /*class Student{
     String name;
     int age;
     public void info(){
         System.out.println(this.name);
         System.out.println(this.age);

     }
    //parametrize contructor
     Student(String name,int age){
         this.name=name;
         this.age=age;
     }
 }

 public class Main {
     public static void main (String args[]){
         Student s1=new Student("hanzalah",21);

         s1.info();
     }
 }*/

/*
 class Student{
     String name;
     int age;
     public void info(){
         System.out.println(this.name);
         System.out.println(this.age);

     }
     //copy contructor
     Student(Student s2) {
         this.name = s2.name;
         this.age = s2.age;
     }
     //contrsuctor for s1
         Student(){
     }l
 }

 public class Main {
     public static void main (String args[]){
         Student s1=new Student();
         s1.name="biilo";
         s1.age=21;
         Student s2=new Student(s1);


         s2.info();
     }
 }*/
         //another class andd object
 class Student{
     String name;
     int age;
     String section;
     public void pinfo{
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.section);
    }
}
public class Main {
     public static void main(String args[]){
         Student s1=new Student();
         s1.name="hamza";
         s1.age=20;
         s1.section="b";
         s1.pinfo();


     }
}
