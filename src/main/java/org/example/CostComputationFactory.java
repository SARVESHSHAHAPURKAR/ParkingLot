package org.example;

public class CostComputationFactory {

    public CostComputation getCostComputation(Ticket ticket){

        switch(ticket.getVehicle().getVehicleType()){

            case TWO_WHEELER:
                return new TwoWheelerCostComputation(new TwoWheelPricingStrategy());
            case FOUR_WHEELER:
                return new FourWheelerCostComputation(new FourWheelPricingStrategy());
            default:
                return null;
        }

    }
}
