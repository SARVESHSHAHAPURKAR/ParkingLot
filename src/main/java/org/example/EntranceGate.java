package org.example;

// IF THERE ARE MULTIPLE ENTRANCE GATES, WE NEED ENTRANCE GATE MANAGER
public class EntranceGate {

    //VehicleType vehicleType;
    Vehicle vehicle;
    ParkingSpotManagerFactory parkingSpotManagerFactory = new ParkingSpotManagerFactory();
    // FACTORY PATTERN
    // GET PARKING SPOT MANAGER BASED ON THE VEHICLE TYPE

    ParkingSpotManager parkingSpotManager = parkingSpotManagerFactory.getParkingSpotManager(vehicle.getVehicleType());

    ParkingSpot parkingSpot = parkingSpotManager.findParkingSpace();

    public void bookSpot(){
        parkingSpotManager.parkVehicle();
    }

    public Ticket generateTicket(){
        return new Ticket(this.vehicle, this.parkingSpot);
    }
}
