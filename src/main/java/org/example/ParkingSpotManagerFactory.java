package org.example;

import java.util.ArrayList;

public class ParkingSpotManagerFactory {

    public ParkingSpotManager getParkingSpotManager(VehicleType type){

        switch(type){

            case TWO_WHEELER:
                return new TwoWheelerParkingSpotManager(new ArrayList<>());
            case FOUR_WHEELER:
                return  new FourWheelerSpotManager(new ArrayList<>());
            default:
                return null;
        }

    }
}
