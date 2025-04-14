package com.exception.handlingjava;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ExceptionFile {
    // 5️⃣ Task: Use throws to Handle a File Not Found (IOException)
    // 📌 Problem:
    
    // Create a method that reads a file from disk.
    // Use throws IOException to indicate that it might fail.
    // Try calling this method and handle the exception in main().
    // 🔹 Expected Output (if file not found):    
    static void readFile(String filename) throws IOException{ //excepton declare here bcc min metho hve to eeal it
      File file =new File(filename);
      Scanner sc=new Scanner(file);
      System.out.println("file contents");
      while(sc.hasNextLine()){
        System.out.println(sc.nextLine());

      }
      sc.close();
    }
   public static void main(String[] args) {
   try{
    readFile("myfile.txt");
   }
   catch (IOException e) {
    System.out.println(" Error: File not found!");

   }
   
}
}
