package com.company.models;

import com.company.enums.Gender;

import java.util.ArrayList;
import java.util.List;

public class Rider extends User {
    private Location fromLocation;
    private Location toLocation;
    private List<Ride> rideList = new ArrayList<Ride>();

    public Rider(String name, int id, Gender gender, Location fromLocation, Location toLocation){
        super(name, id, gender);
        this.fromLocation = fromLocation;
        this.toLocation = toLocation;
    }
    public Location getFromLocation() {
        return fromLocation;
    }

    public void setFromLocation(Location fromLocation) {
        this.fromLocation = fromLocation;
    }

    public Location getToLocation() {
        return toLocation;
    }

    public void setToLocation(Location toLocation) {
        this.toLocation = toLocation;
    }

    public List<Ride> getRideList() {
        return rideList;
    }

    public void setRideList(List<Ride> rideList) {
        this.rideList = rideList;
    }
}