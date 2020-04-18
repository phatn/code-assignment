package com.singtel.assignment.domain;

public class Rooster extends Bird {

    public Rooster() {
        sayBehavior = new RoosterSay();
    }
}
