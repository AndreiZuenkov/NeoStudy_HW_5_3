package com.company;

public class Main {

    public static void main(String[] args) {

        Employees employees=Employees.MANAGER;
        Employees employees2=Employees.PRESIDENT;
        Employees employees3=Employees.WORKER;
        Employees employees4=Employees.PROGRAMMER;

        System.out.println(employees.getJobDescription() + " " + employees.getId() + " " +  employees.getSalary());
        System.out.println(employees2.getJobDescription() + " " + employees2.getId() + " " +  employees2.getSalary());
        System.out.println(employees3.getJobDescription() + " " + employees3.getId() + " " +  employees3.getSalary());
        System.out.println(employees4.getJobDescription() + " " + employees4.getId() + " " +  employees4.getSalary());
    }
}
