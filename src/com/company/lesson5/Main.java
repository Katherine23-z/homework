package com.company.lesson5;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Employer[] employeers = new Employer[5];
        employeers[0] = new Employer("Ivan Ivanov", "Manager", "ivivan@mail.ru", 8900554125l, 45000.00f, 45);
        employeers[1] = new Employer("Peter Petrov", "Manager", "petroff@mail.ru", 8900445124l, 40000.00f, 26);
        employeers[2] = new Employer("Olga Semenova", "Secretary", "olsem@mail.ru", 8900132645l, 35000.00f, 30);
        employeers[3] = new Employer("Anna Somova", "Engineer", "ansom@mail.ru", 8800554114l, 30000.00f, 42);
        employeers[4] = new Employer("Ivan Petrov", "Engineer", "ivpetr@mail.ru", 8905402451l, 40000.00f, 43);


        for (int i = 0; i < employeers.length; i++) {
            int empAge = employeers[i].getAge();
            if (empAge > 40) {
                employeers[i].print();
            }
        }

    }

    }


