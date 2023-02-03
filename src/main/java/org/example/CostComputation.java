package org.example;

public class CostComputation {

    Ticket ticket;

    PricingStrategy obj;

    // STRATEGY PATTERN
    public CostComputation(PricingStrategy pricingStrategy){
        obj = pricingStrategy;
    }

    int calculatePrice(){
        return obj.getPrice(ticket);
    }
}
