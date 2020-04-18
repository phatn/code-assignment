package com.singtel.assignment.domain;

public abstract class Animal implements AnimalBehavior {

    public void walk() {
        System.out.println("I am walking");
    }

    public void fly() {
        System.out.println("I am flying");
    }

    public void sing() {
        System.out.println("I am singing");
    }
}
