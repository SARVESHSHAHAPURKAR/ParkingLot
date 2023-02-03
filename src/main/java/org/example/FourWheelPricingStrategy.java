package org.example;

public class FourWheelPricingStrategy implements PricingStrategy{
    @Override
    public int getPrice(Ticket ticket) {

        // ASSUME HOURLY PRICE COMPUTATION --> calculate number of hours sepnt from the ticket
        return 10;
    }
}
