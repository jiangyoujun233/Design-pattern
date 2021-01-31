package com.nora.design.ObserverPattern;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        NoraServer noraServer = new NoraServer();

        NoraUser tom = new NoraUser("tom");
        NoraUser jack = new NoraUser("jack");
        NoraUser jerry = new NoraUser("jerry");

        noraServer.RegisterObserver(tom);
        noraServer.RegisterObserver(jack);
        noraServer.RegisterObserver(jerry);

        noraServer.setInformation("消息通知1");

        System.out.println("--------------------------------");
        noraServer.removeObserver(jack);
        noraServer.setInformation("移除jack");

    }



}
