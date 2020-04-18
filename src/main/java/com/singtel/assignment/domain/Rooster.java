package com.singtel.assignment.domain;

public class Rooster extends Bird {

    private Sayable sayable;

    public Rooster(Sayable sayable) {
        this.sayable = sayable;
    }

    public void say() {
        sayable.say();
    }
}
