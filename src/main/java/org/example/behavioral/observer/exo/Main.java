package org.example.behavioral.observer.exo;

import org.example.behavioral.observer.Observer;

public class Main {
    public static void main(String[] args) {


        EventManager eventManager = new EventManager();

        Observer1 observer1 = new Manager("manager");
        Observer1 observer2 = new Manager("manager 2");

       eventManager.addObservers(observer1);

       eventManager.notifyObservers(" t'es viré ! ");

    }
}
