package org.example.exo;

public class Main {
    public static void main(String[] args) {

        House house = new House.Builder().stage("1").pool(true).color("blue");

        System.out.println(house);
    }
}
