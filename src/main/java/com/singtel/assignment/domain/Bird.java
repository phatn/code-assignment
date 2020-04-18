package com.singtel.assignment.domain;

public class Bird extends Animal {

    public Bird() {
        walkBehavior = new DefaultWalk();
        flyBehavior = new DefaultFly();
        singBehavior = new DefaultSing();
    }

}
