package com.main;

import com.vehicles.Car;

public class Main {
public static void main(String[] args) {
//     In Main method, create a Car object and:

// Set values through constructor.
// Call showInfo() from Vehicle.
// Call showCarInfo() from Car.
Car c=new Car("Tesla", 150, 2) ;
c.showInfo();
c.showCarInfo();

}
}
