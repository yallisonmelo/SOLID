package br.com.yfsmsystem.openclosed.solution;

public class Car extends Vehicle{
    public Car(int maxSpeed, String type) {
        super(maxSpeed, type);
    }
    @Override
    public double calculateAllowedSpeed() {
        return super.getMaxSpeed() * 0.8;
    }
}
