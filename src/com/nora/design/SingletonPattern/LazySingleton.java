package com.nora.design.SingletonPattern;

//懒汉式
public class LazySingleton {

    private static LazySingleton instance;

    private LazySingleton(){}

    //线程不安全
    /*public static LazySingleton getInstance(){
        if(instance == null){
            instance = new LazySingleton();
        }
        return instance;
    }*/

    //线程安全
    public static synchronized LazySingleton getInstance(){
        if(instance == null){
            instance = new LazySingleton();
        }
        return instance;
    }
}
