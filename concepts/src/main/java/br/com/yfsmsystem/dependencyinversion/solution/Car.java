package br.com.yfsmsystem.dependencyinversion.solution;

public class Car {
    private Engine engine;

    //Car is not depend on low-level PetrolEngine class anymore
    public Car(Engine engine) {
        this.engine = engine;
    }

    public void start() {
        this.engine.start();
    }
}
