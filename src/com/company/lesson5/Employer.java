package com.company.lesson5;

public class Employer {

    String name;
    String post;
    String email;
    long phoneNumber;
    float salary;
    int age;


    Employer(String name, String post, String email, long phoneNumber, float salary, int age) {
        this.name = name;
        this.post = post;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    void print(){
        System.out.println(name + " " + post + " " + email + " " + phoneNumber + " " + salary + " " + age);
    }



}
