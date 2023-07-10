package br.com.yfsmsystem.singleresponsibility.solution;

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


}
