package com.singtel.assignment;

import com.singtel.assignment.domain.Bird;
import com.singtel.assignment.domain.Chicken;
import com.singtel.assignment.domain.Duck;

public class Solution {

    public static void main(String[] args) {
        Bird duck = new Duck();
        Bird chicken = new Chicken();
        System.out.println("=== Duck behavior ===");
        duck.say();
        duck.swim();

        System.out.println("\n=== Chicken behavior===");
        chicken.say();
        chicken.swim();
    }
}
