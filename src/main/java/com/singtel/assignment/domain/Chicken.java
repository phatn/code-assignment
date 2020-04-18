package com.singtel.assignment.domain;

public class Chicken extends Bird {

    public Chicken() {
        sayBehavior = new ChickenSay();
    }
}
