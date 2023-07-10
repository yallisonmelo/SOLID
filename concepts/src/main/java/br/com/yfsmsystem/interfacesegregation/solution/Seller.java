package br.com.yfsmsystem.interfacesegregation.solution;

public class Seller extends Employee implements Commissionable {
    private double salary;
    private int amountSale;

    public Seller(double salary, int amountSale) {
        this.salary = salary;
        this.amountSale = amountSale;
    }

    @Override
    public double getSalary() {
        return this.salary + this.getCommission();
    }

    @Override
    public double getCommission() {
        return this.amountSale * 0.2;
    }

}
