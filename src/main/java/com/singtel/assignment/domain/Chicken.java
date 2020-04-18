package com.singtel.assignment.domain;

public class Chicken extends Bird {

    private Sayable sayable;

    public Chicken(Sayable sayable) {
        this.sayable = sayable;
    }

    public void say() {
        sayable.say();
    }
}
