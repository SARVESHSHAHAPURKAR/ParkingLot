package org.example;

public class TwoWheelPricingStrategy implements PricingStrategy{
    @Override
    public int getPrice(Ticket ticket) {

        // ASSUME MINUTE BASED PRICING STRATEGY
        return 5;
    }
}
