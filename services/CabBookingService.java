package com.company.services;

import com.company.enums.Gender;
import com.company.exceptions.CreateException;
import com.company.exceptions.DriverNotAvailableException;
import com.company.models.Driver;
import com.company.models.Location;
import com.company.models.Rider;
import com.company.models.Vehicle;

public class CabBookingService {
    private static CabBookingService cabBookingService = null;

    private CabBookingService(){

    }

    public static CabBookingService getInstance(){
        if(cabBookingService == null){
            cabBookingService = new CabBookingService();
        }
        return cabBookingService;
    }

    private UserService userService = UserService.getInstance();

    private RideService rideService = RideService.getInstance();

    public Driver registerDriver(String name, int id, Gender gender, Vehicle vehicle, boolean available) throws CreateException{
        return userService.registerDriver(name, id, gender, vehicle, available);
    }
    public Rider registerRider(String name, int id, Gender gender, Location fromLocation, Location toLocation) throws CreateException {
        return userService.registerRider(name, id, gender, fromLocation, toLocation);
    }

    public Driver bookRide(int riderId, Location fromLocation, Location toLocation) throws DriverNotAvailableException {
        return rideService.bookRide(riderId, fromLocation, toLocation);
    }

}
