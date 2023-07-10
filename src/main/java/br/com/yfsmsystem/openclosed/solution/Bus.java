package br.com.yfsmsystem.openclosed.solution;

public class Bus extends Vehicle {
    public Bus(int maxSpeed, String type) {
        super(maxSpeed, type);
    }
    @Override
    public double calculateAllowedSpeed() {
        return super.getMaxSpeed() * 0.8;
    }
}
