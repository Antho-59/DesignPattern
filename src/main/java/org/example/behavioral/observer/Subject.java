package org.example.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {

    private List<Observer> observers = new ArrayList<>();
    // visibilité + List< interface > nom quon lui donne = nouvelle liste

    public void addObserver(Observer observer){
        this.observers.add(observer);
    }

    public void removeObserver(Observer observer){
        this.observers.remove(observer);
    }

    public void notifyObservers(String message){
        for (Observer observer : observers){
            observer.update(message);
        }
    }

}
