package org.example.creational;

import org.example.creational.builder.Person;

public class Main {

    public static void main(String[] args) {

        Person person = new Person.Builder().firstName("toto").lastName("tata").age(42).build();
        Person person1 = new Person.Builder().firstName("tutu").lastName("treeta").age(22).build();

        Person person4 = new Person.Builder().build();

        System.out.println(person);
        System.out.println(person1);
        System.out.println(person4);
    }
}
