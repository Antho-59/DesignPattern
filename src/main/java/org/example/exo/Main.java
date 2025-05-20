package org.example.exo;

public class Main {
    public static void main(String[] args) {

     House house = new House.Builder()
             .pool(true)
             .color("bleu")
             .stage(4)
             .roofType("tuile")
             .build();

     House house1 = new House.Builder()
             .stage(2)
             .color("vert")
             .build();

        System.out.println(house);
        System.out.println(house1);
    }
}
