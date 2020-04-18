package com.singtel.assignment;

import com.singtel.assignment.domain.*;

public class Solution {

    public static void main(String[] args) {
        Animal parrot = new Parrot();

        // Parrot Dog
        parrot.setSayBehavior(new ParrotDogSay());
        parrot.say();

        // Parrot Cat
        parrot.setSayBehavior(new ParrotCatSay());
        parrot.say();

        // Parrot Rooster
        parrot.setSayBehavior(new ParrotRoosterSay());
        parrot.say();

        // Parrot Duck
        parrot.setSayBehavior(new ParrotDuckSay());
        parrot.say();

    }
}
