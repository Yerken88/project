package com.company.osj;

public class Staff implements Workers {
    int id;
    String name;
    String surname;
    int salary;

    @Override
    public String getWorkerData() {
        return null;
    }

    @Override
    public int getSalary() {
        return 0;
    }
}
