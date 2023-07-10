package br.com.yfsmsystem.singleresponsibility.solution;

public class EmployeeSalaryCalculator {

    public int calculateNextSalary(int salary) {
       return  (int) (salary * 0.50);
    }

    public int calculateNetSalary(int salary) {
        int tax = (int) (salary * 0.27);
        return salary - tax;
    }

}
