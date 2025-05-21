package org.example.behavioral.observer.exo;

import java.util.ArrayList;
import java.util.List;

public class EventManager {

    private List<Observer1>observerList = new ArrayList<>();

    public void addObservers(Observer1 observer1){
        this.observerList.add(observer1);
    }

    public void addObs(Observer1 observer1){
        this.observerList.add(observer1);
    }

    public void removeObservers(Observer1 observer1){
        this.observerList.remove(observer1);
    }

    public void notifyObservers(String message){
        for (Observer1 observer1 : observerList){
            observer1.update(message);
        }
    }


}
