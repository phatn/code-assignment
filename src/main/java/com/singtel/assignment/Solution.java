package com.singtel.assignment;

import com.singtel.assignment.domain.*;

public class Solution {

    public static void main(String[] args) {
        Bird chicken = new Chicken(new ChickenSay());
        Bird rooster = new Rooster(new RoosterSay());

        System.out.println("=== Chicken behavior ===");
        chicken.say();

        System.out.println("\n=== Rooster behavior===");
        rooster.say();
    }
}
