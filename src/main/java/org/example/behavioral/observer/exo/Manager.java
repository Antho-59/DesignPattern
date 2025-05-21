package org.example.behavioral.observer.exo;

public class Manager implements Observer1{

    private String name;

    public Manager(String name){
        this.name= name;
    }

    @Override
    public void update(String message) {
        System.out.println(name+" a recu un nouveaur message : "+message);
    }

//
}
