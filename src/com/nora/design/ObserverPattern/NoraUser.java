package com.nora.design.ObserverPattern;


//观察者
public class NoraUser implements Observer{

    private String name;
    private String message;

    public NoraUser(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
            this.message = message;
            read();
    }

    public void read(){
        System.out.println(name+"收到消息："+message);
    }
}
