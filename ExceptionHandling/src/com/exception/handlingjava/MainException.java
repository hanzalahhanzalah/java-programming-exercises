package com.exception.handlingjava;

import java.util.Scanner;

public class MainException {
    // Task: Create a Custom Exception (AgeException)
    // 📌 Problem:
    
    // Create a custom exception class called AgeException.
    // In main(), ask the user for their age.
    // If the age is less than 18, throw AgeException with the message: "You must be 18 or older to register!".
    // Catch the exception in main() and print the message
    int age;
    public static void checkAge(int age){ 
       try{ if (age<18){
        throw new AgeException("\"You must be 18 or older to register!\"");
        } {
            System.out.println("Access granted - You are old enough!");
        }}
        catch(AgeException message){
            System.out.println(message);

        }
       
         }
         public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
        System.out.println("enter your age: ");
        checkAge(14);
        }

        }
        
     
   



