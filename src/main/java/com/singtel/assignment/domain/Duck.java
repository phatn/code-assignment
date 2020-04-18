package com.singtel.assignment.domain;

public class Duck extends Bird {

    public Duck() {
        sayBehavior = new DuckSay();
        swimBehavior = new DefaultSwim();
    }

}
