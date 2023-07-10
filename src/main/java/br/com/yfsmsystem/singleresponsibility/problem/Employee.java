package br.com.yfsmsystem.singleresponsibility.problem;

public class Employee {

    private String name;
    private String email;
    private int salary;

    public Employee(String name, String email, int salary) {
        this.name = name;
        this.email = email;
        this.salary = salary;
    }

    public String generateEmailEmployee(String name) {
        return name + "@mail.com";
    }

    public int calculateNextSalary(int salary) {
        int salaryIncrease = (int) (salary * 0.50);
        return salaryIncrease;
    }

    public int calculateNetSalary(int salary) {
        int tax = (int) (salary * 0.27);
        return salary - tax;
    }

}
