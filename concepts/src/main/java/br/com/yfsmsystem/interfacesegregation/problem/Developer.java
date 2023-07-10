package br.com.yfsmsystem.interfacesegregation.problem;

public class Developer extends Employee {
    private double salary;

    public Developer(double salary) {
        this.salary = salary;
    }

    @Override
    public double getSalary() {
        return 0;
    }

    @Override
    public double getCommission() {
        return 0; //Not Used commission, the developer is not seller
    }
}
