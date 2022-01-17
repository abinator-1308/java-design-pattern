package com.designPattern.demo.model.creational;

import com.designPattern.demo.enumobjects.Vehicle;

import static com.designPattern.demo.enumobjects.Vehicle.BIKE;
import static com.designPattern.demo.enumobjects.Vehicle.CAR;

abstract class VehicleClass {
    int wheels;
}

class Car extends VehicleClass{

    public Car(int wheels) {
        this.wheels = wheels;
    }
}

class Bike extends VehicleClass{

    public Bike(int wheels) {
        this.wheels = wheels;
    }
}

class VehicleFactory {
    public static VehicleClass getInstance(Vehicle vehicle, int wheels) {
        if(vehicle == CAR) {
            return new Car(wheels);
        } else {
            return new Bike(wheels);
        }
    }
}

public class Factory {
    VehicleClass car = VehicleFactory.getInstance(CAR, 4);
    VehicleClass bike = VehicleFactory.getInstance(BIKE, 2);
}
