package com.company.Legacy;

public class Mina {
    public static void main(String[] args) {
        User user=new User(1,"1","1","1","1");
        User user1=new User(2,"H","po","sd","1");
        Staff staff=new Staff(3,"sas","1" ,"1","ss",1000 );
        Staff staff1=new Staff(4,"ascac","asda","1" ,"1",1000);
        Student student=new Student(5,"sasc","1" ,"1","ss",4 );
        Student student1=new Student(6,"scasc","1" ,"1","ss",4 );
        staff.addSubject("YTBHJ");
        staff.addSubject("asdwd");
        staff.addSubject("LJJksnw");
        staff1.addSubject("aDWAD");
        student.addSubject("adakiedwe");
        User[]users={user,user1,staff1,staff,student,student1};
        for (User u:users) {
            System.out.println(u.getData());

        }



    }
}
