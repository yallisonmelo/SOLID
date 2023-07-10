package br.com.yfsmsystem.interfacesegregation.solution;

public abstract class Employee implements Technology {

    private String name;
    private double salary;

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public double getSalary() {
        return this.getSalary();
    }

}
