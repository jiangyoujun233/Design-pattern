package com.nora.design.ObserverPattern;

//被观察者接口
public interface Observerable {

    public void RegisterObserver(Observer o);
    public void removeObserver(Observer o);
    public void NotifyObserver();
}
