package com.exception.handlingjava;

public class AgeException extends Exception {
    

    // Task: Create a Custom Exception (AgeException)
    // 📌 Problem:
    
    // Create a custom exception class called AgeException.
    // In main(), ask the user for their age.
    // If the age is less than 18, throw AgeException with the message: "You must be 18 or older to register!".
    // Catch the exception in main() and print the message

    public AgeException(String message){
        super(message);
    }
}
