package com.company;

public class Main {

    public static void main(String[] args) {

        Employee employee = Employee.MANAGER;
        Employee employee2 = Employee.PRESIDENT;
        Employee employee3 = Employee.WORKER;
        Employee employee4 = Employee.PROGRAMMER;

        System.out.println(employee.getJobDescription() + " " + employee.getId() + " " +  employee.getSalary());
        System.out.println(employee2.getJobDescription() + " " + employee2.getId() + " " +  employee2.getSalary());
        System.out.println(employee3.getJobDescription() + " " + employee3.getId() + " " +  employee3.getSalary());
        System.out.println(employee4.getJobDescription() + " " + employee4.getId() + " " +  employee4.getSalary());
    }
}
