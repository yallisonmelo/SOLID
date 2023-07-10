package br.com.yfsmsystem.interfacesegregation.problem;

public abstract class Employee {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract double getSalary();

    public abstract double getCommission();
}
