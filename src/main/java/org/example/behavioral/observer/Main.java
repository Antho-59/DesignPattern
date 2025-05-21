package org.example.behavioral.observer;

public class Main {
    public static void main(String[] args) {

        Subject subject = new Subject();

        Observer observer1 = new MyObserver("observer1");
        Observer observer2 = new MyObserver("observer2");

        subject.addObserver(observer1);
        subject.addObserver(observer2);

        subject.notifyObservers("un nvel article vient darriver");
    }
}
