package com.company.models;

import com.company.enums.Gender;

public class Driver extends User {

    private Vehicle vehicle;
    private boolean available;

    public Driver(String name, int id, Gender gender, Vehicle vehicle, boolean available){
        super(name, id, gender);
        this.vehicle = vehicle;
        this.available = available;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}
