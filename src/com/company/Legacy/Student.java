package com.company.Legacy;

import java.util.Arrays;

public class Student extends User{
    private double gpa;
    private String courses[] = new String[100];
    private int indexOfCourses = 0;

    public Student(int id, String login, String password, String name, String surname, double gpa) {
        super(id, login, password, name, surname);
        this.gpa = gpa;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String getData() {
        return "Student{" +
                "gpa=" + gpa +
                ", courses=" + Arrays.toString(courses) +
                ", indexOfCourses=" + indexOfCourses +
                ", id=" + id +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
     public void addSubject(String subject){
        courses[indexOfCourses]=subject;
        indexOfCourses++;
     }
}
