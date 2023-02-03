package org.example;

import java.util.List;

public class ParkingSpotManager {

    public List<ParkingSpot> parkingSpotList;

    public ParkingSpotManager(List<ParkingSpot> parkingSpotList){
        this.parkingSpotList = parkingSpotList;
    }

    public ParkingSpot findParkingSpace(){

        // DIFFERENT PARKING STRATEGIES ARE POSSIBLE
        // USE STRATEGY PATTERN
        return null;
    }

    public void addParkingSpace(){
        parkingSpotList.add(new ParkingSpot());
    }

    public void removeParkingSpace(ParkingSpot parkingSpot){
        parkingSpotList.remove(parkingSpot);
    }

    public void parkVehicle(){

    }

    public void removeVehicle(){

    }

}
