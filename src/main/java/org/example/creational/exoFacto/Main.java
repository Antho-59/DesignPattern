package org.example.creational.exoFacto;

public class Main {
    public static void main(String[] args) {


        AnimalFactory dogFactory =new DogFactory();
        Animal dog = dogFactory.createAnimal();
        dog.shout();

        AnimalFactory catFactory = new CatFactory();
        Animal cat = catFactory.createAnimal();
        cat.shout();




    }


}
