package br.com.yfsmsystem.dependencyinversion.problem;

public class Car {
    private PetrolEngine engine;

    public Car(PetrolEngine engine) {
        this.engine = engine;
    }

    public void start() {
        this.engine.start();
    }
}
