package org.example;

// IF THERE ARE MULTIPLE EXIT GATES, WE NEED AN EXIT GATE MANAGER
public class ExitGate {


    Ticket ticket;
    VehicleType vehicleType;
    ParkingSpotManagerFactory parkingSpotManagerFactory = new ParkingSpotManagerFactory();
    // FACTORY PATTERN
    // GET PARKING SPOT MANAGER BASED ON THE VEHICLE TYPE

    ParkingSpotManager parkingSpotManager = parkingSpotManagerFactory.getParkingSpotManager(vehicleType);

    public void vacateParkingSpace() {
        parkingSpotManager.removeVehicle();
    }

    // FACTORY PATTERN TO RETURN COST COMPUTATION ACCORDING TO VEHICLE TYPE
    CostComputationFactory costComputationFactory = new CostComputationFactory();

    CostComputation costComputation = costComputationFactory.getCostComputation(ticket);

    int calculatePrice(){
        return costComputation.calculatePrice();
    }

    // Payment
    // Create a payment interface and implement card payment and cash payment

}
