package com.vehicles;

public class Car extends Vehicle {
//     Create a subclass Car that extends Vehicle with:

// private int doors (e.g., 4 doors).
// Constructor to initialize brand, speed, and doors.
// Method showCarInfo() to display car details.
private int doors;
public Car(String brand,int speed,int doors){
    super(brand,speed);
    this.doors=doors;

}


public void showCarInfo(){
System.out.println("Brand: "+getBrand()+" ,"+"Speed: "+" "+speed+" km"+" "+"Doors: "+doors);
}
}
