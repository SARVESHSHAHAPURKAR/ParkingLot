package org.example;

public class Ticket {

    public int entryTime;
    public Vehicle vehicle;
    public ParkingSpot parkingSpot;

    public Ticket(Vehicle vehicle, ParkingSpot parkingSpot) {
        this.vehicle = vehicle;
        this.parkingSpot = parkingSpot;
    }

    public int getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(int entryTime) {
        this.entryTime = entryTime;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public ParkingSpot getParkingSpot() {
        return parkingSpot;
    }

    public void setParkingSpot(ParkingSpot parkingSpot) {
        this.parkingSpot = parkingSpot;
    }
}
