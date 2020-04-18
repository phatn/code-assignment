package com.singtel.assignment.domain;

public class Fish extends Animal {

    public Fish() {
        this.singBehavior = new FishSing();
        this.walkBehavior = new FishWalk();
        this.swimBehavior = new DefaultSwim();
    }
}
