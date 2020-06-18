package com.company.models;

public class Vehicle {
    private String name;
    private int model;
    private Location location;

    public Vehicle(String name, int model, Location location)
    {
        this.name = name;
        this.model = model;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
}
