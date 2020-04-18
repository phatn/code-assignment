package com.singtel.assignment.domain;

public abstract class Animal  {

    protected FlyBehavior flyBehavior;

    protected  SingBehavior singBehavior;

    protected SwimBehavior swimBehavior;

    protected WalkBehavior walkBehavior;

    protected SayBehavior sayBehavior;


    // ====== Behavior =======
    public void say() {
        sayBehavior.say();
    }

    public void fly() {
        flyBehavior.fly();
    }

    public void sing() {
        singBehavior.sing();
    }

    public void swim() {
        swimBehavior.swim();
    }

    public void walk() {
        walkBehavior.walk();
    }

    // =====================

    public FlyBehavior getFlyBehavior() {
        return flyBehavior;
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public SingBehavior getSingBehavior() {
        return singBehavior;
    }

    public void setSingBehavior(SingBehavior singBehavior) {
        this.singBehavior = singBehavior;
    }

    public SwimBehavior getSwimBehavior() {
        return swimBehavior;
    }

    public void setSwimBehavior(SwimBehavior swimBehavior) {
        this.swimBehavior = swimBehavior;
    }

    public WalkBehavior getWalkBehavior() {
        return walkBehavior;
    }

    public void setWalkBehavior(WalkBehavior walkBehavior) {
        this.walkBehavior = walkBehavior;
    }

    public SayBehavior getSayBehavior() {
        return sayBehavior;
    }

    public void setSayBehavior(SayBehavior sayBehavior) {
        this.sayBehavior = sayBehavior;
    }
}
