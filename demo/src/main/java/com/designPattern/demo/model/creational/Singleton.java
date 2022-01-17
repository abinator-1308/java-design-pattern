package com.designPattern.demo.model.creational;

import java.util.Objects;

// Lazy implementation
public class Singleton {
    private static Singleton instance;

    private Singleton() {
        System.out.println("Object is constructed");
    }

    public Singleton getInstance() {
        if(Objects.isNull(instance)) {
            instance = new Singleton();
        }
        return instance;
    }
}

// Eager Implementation`
class SingletonEager {
    private static SingletonEager instance = new SingletonEager();

    private SingletonEager() {
        System.out.println("This is an eager implementation");
    }

    public SingletonEager getInstance() {
        return instance;
    }

}

// Thread safe implementation
class SingletonSyncronized {
    private static SingletonSyncronized instance;

    private SingletonSyncronized() {
        System.out.println("Thread safe implementation of singleton");
    }

    public static synchronized SingletonSyncronized getInstance() {
        if(Objects.isNull(instance)) {
            instance = new SingletonSyncronized();
        }
        return instance;
    }
}
