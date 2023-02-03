package org.example;

public class ParkingSpot {

    private Long id;
    private boolean isEmpty;
    private Vehicle vehicle;
    int price;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean isEmpty() {
        return isEmpty;
    }

    public void setEmpty(boolean empty) {
        isEmpty = empty;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void parkVehicle(Vehicle v){
        this.vehicle = v;
        isEmpty = false;
    }

    public void removeVehicle(Vehicle v){
        this.vehicle = null;
        isEmpty = true;
    }
}
