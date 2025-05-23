package Observer;

import java.util.ArrayList;
import java.util.List;

public class Flipkart {
    //Publisher
    private static Flipkart instance = null;
    private List<Observer> observers = new ArrayList<>();

    private Flipkart(){}
    public static Flipkart getInstance(){
        if(instance == null){
            instance = new Flipkart();
        }
        return instance;
    }
    void registerObserver(Observer observer){
        observers.add(observer);
    }
    void unregisterObserver(Observer observer){
        observers.remove(observer);
    }
    void notifyObservers(){
        for(Observer observer : observers){
            observer.annouceOrderPlaced();
        }
    }
}
