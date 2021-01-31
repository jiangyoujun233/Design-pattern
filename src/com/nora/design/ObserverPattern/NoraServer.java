package com.nora.design.ObserverPattern;

import java.util.ArrayList;
import java.util.List;

//被观察者
public class NoraServer implements Observerable{

    private List<Observer> list;
    private String message;

    public NoraServer(){
        list = new ArrayList<Observer>();
    }

    @Override
    public void RegisterObserver(Observer o) {

            list.add(o);

    }

    @Override
    public void removeObserver(Observer o) {

        if(!list.isEmpty()){
        list.remove(o);
        }

    }

    @Override
    public void NotifyObserver() {

        for(int i = 0; i < list.size(); i++){
            Observer observer = list.get(i);
            observer.update(message);
        }

    }

    public void setInformation(String s){

        this.message = s;
        NotifyObserver();

    }
}
