package com.company;

public enum Employee {

    PRESIDENT(1, "Президент компании", 100000),
    MANAGER(2, "Менеджер по пражам", 50000),
    PROGRAMMER(3, "Разработчик ПО", 90000),
    WORKER(4, "Рабочий", 40000);

    private final int id;
    private final String jobDescription;
    private final double salary;

    Employee(int id, String jobDescription, double salary){
        this.id=id;
        this.jobDescription=jobDescription;
        this.salary=salary;

    }

    public int getId() {
        return id;
    }

    public String getJobDescription() {
        return jobDescription;
    }

    public double getSalary() {
        return salary;
    }
}
