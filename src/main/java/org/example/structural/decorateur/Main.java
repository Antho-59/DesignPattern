package org.example.structural.decorateur;

public class Main {

    public static void main(String[] args) {
        // création d'une pizza basique
        Pizza basePizza = new PlainPizza();
        System.out.println(basePizza.getDescription()+" "+basePizza.getCost());

        //ajout de fromage pour creer nvlle pizza
        Pizza cheesePizza = new CheeseDecorator(basePizza);
        System.out.println(cheesePizza.getDescription()+" "+cheesePizza.getCost());

        //ajout d'olive sur ma pizza au fmge
        Pizza olivePizza = new OliveDecorator(cheesePizza);
        System.out.println(olivePizza.getDescription()+" "+olivePizza.getCost());
    }
}
