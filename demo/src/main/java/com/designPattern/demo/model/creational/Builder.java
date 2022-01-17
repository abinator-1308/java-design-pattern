package com.designPattern.demo.model.creational;

@lombok.Builder
class Vehicles {
    int wheels;
    String colour;
    int doors;

    private Vehicles() {};
}

public class Builder {
    Vehicles car = Vehicles.builder().colour("red").doors(4).wheels(4).build();
}
