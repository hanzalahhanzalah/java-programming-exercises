package com.exception.handlingjava; 

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandlingTasks{

public static void main(String[] args) {
    

    // 1️⃣ Task: Handle Division by Zero (ArithmeticException)
    // 📌 Problem:
    
    // Write a program that takes two numbers as input.
    // Try to divide them inside a try block.
    // If the denominator is 0, catch the ArithmeticException and display "Cannot divide by zero!".
    Scanner sc=new Scanner(System.in);
    try
    {System.out.println("enter value 1 to divide");
    int a=sc.nextInt();
    System.out.println("enter value 2 to divide by value 1");
    int b=sc.nextInt();
    System.out.println("divide :"+ a/b);}
    catch(ArithmeticException e){
        System.out.println("Cannot divide by zero!");}

        // 2️⃣ Task: Handle Invalid Array Index (ArrayIndexOutOfBoundsException)
        // 📌 Problem:
        
        // Create an array of 5 integers.
        // Ask the user for an index number.
        // Try to print the element at that index using try-catch.
        // If the index is out of range, catch the ArrayIndexOutOfBoundsException and display a warning.    
     int[] arr=new int[] {34,59,79,90,32}  ;
     try{ System.out.println("enter array number");
     int i=sc.nextInt();
     System.out.println("the element at : "+i+ " is :"+arr[i]);}
    catch(ArrayIndexOutOfBoundsException c){
        System.out.println("Error: Invalid index! Please enter a value between 0-4");

        // 3️⃣ Task: Handle NullPointerException (Null Value Handling)
        // 📌 Problem:
        
        // Create a String variable and set it to null.
        // Try to print its length using .length().
        // If a NullPointerException occurs, catch it and display a custom error message.    

        try{String Vari=null;
    System.out.println(Vari.length());}
    catch(NullPointerException d){
        System.out.println("Error: Cannot find length of null.");

    }
    // 4️⃣ Task: Handle InputMismatchException (Invalid User Input)
    // 📌 Problem:
    
    // Ask the user to enter a number.
    // If the user enters a non-numeric value, catch the InputMismatchException and display "Invalid input! Please enter a number.". 
    try{System.out.println("enter a number");
    int num=sc.nextInt();}
    catch(InputMismatchException k){
        System.out.println( "Invalid input! Please enter a number.");
        sc.next(); // Clears the invalid input
    }

    // 🚀 Explanation of the Bonus Challenge: Handling Multiple Exceptions Together
    // This program reads user input, accesses an array, and performs division.
    // We must handle three possible exceptions:
    
    // ArrayIndexOutOfBoundsException → If the user enters an invalid index.
    // ArithmeticException → If division by zero happens.
    // InputMismatchException → If the user enters non-numeric input.
    // finally block → Ensures "End of program" always prints.
    int[]newArray=new int[]{10,100,40,68};
    try{System.out.println("enter array number must 0 to 3");
     int j=sc.nextInt();
     System.out.println("the element at index : "+j+ " is :"+newArray[j]);
     System.out.println("enter a divisor: ");
     int l=sc.nextInt();
    int divide=newArray[j]/ l;
}
    catch(ArrayIndexOutOfBoundsException u){
        System.out.println("you have enterd wrong size to find an element");

    }
    catch(InputMismatchException m){
        System.out.println("you have enterd wrong value other then int");

    }
    catch(ArithmeticException o){
        System.out.println("element does not divisble by zero");


    }
    finally{
        System.out.println("program ends");
    }
    }


sc.close();

}}

