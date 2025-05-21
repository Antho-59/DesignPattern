package org.example.creational.exoFacto;

public class Main {
    public static void main(String[] args) {


//        AnimalFactory dogFactory =new DogFactory();
//        Animal dog = dogFactory.createAnimal("Krypto");
//        Animal dog2 = dogFactory.createAnimal("Kronembourg");
//        dog.shout();
//        dog2.shout();
//
//        AnimalFactory catFactory = new CatFactory();
//        Animal cat = catFactory.createAnimal("Mistigris");
//        cat.shout();


        BigFactory bigFactory = new BigFactory();
        bigFactory.enregistrerFactory("chien",new DogFactory());
        bigFactory.enregistrerFactory("chat",new CatFactory());

        Animal cat = bigFactory.produireAnimal("chat");
        cat.shout();
    }


}
