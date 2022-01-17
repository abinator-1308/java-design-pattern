package com.designPattern.demo.model.creational;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
class Vehicle implements Cloneable{
    private List<String> vehicleList;

    public Vehicle() {
        this.vehicleList = new ArrayList<>();
    }

    public Vehicle(List<String> vehicleList) {
        this.vehicleList = vehicleList;
    }

    public void addData() {
        vehicleList.add("Verna");
        vehicleList.add("City");
        vehicleList.add("Ciaz");
        vehicleList.add("XUV");
        vehicleList.add("Baleno");
    }

    @Override
    public Object clone() {
        List<String> tempList = new ArrayList<>();
        tempList.addAll(this.getVehicleList());
        return new Vehicle(tempList);
    }
}

public class Prototype {
    public Vehicle createVehicle() {
        Vehicle vehicleProto = new Vehicle();
        vehicleProto.addData();
        return (Vehicle) vehicleProto.clone();
    }
}
