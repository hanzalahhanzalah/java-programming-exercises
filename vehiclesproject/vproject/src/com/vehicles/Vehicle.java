package com.vehicles;

public class Vehicle {
//     Create a class Vehicle with:

// private String brand (e.g., "Toyota")
// protected int speed (e.g., 100 km/h)
// Constructor to initialize brand and speed.
// Getter method to get brand.
// Method showInfo() to display details.
//

private String brand;
protected int speed;
public Vehicle(String brand,int speed){
    this.brand=brand;
    this.speed=speed;
    }

    public String getBrand() {
        return brand;
    }
    
public void showInfo(){
System.out.println("Brand: "+brand+" ,"+"Speed "+ speed+" km" );
}
 }
