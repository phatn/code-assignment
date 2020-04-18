package com.singtel.assignment;

import com.singtel.assignment.domain.Bird;
import com.singtel.assignment.domain.Chicken;
import com.singtel.assignment.domain.Duck;
import com.singtel.assignment.domain.Rooster;

public class Solution {

    public static void main(String[] args) {
        Bird chicken = new Chicken();
        Bird rooster = new Rooster();

        System.out.println("=== Chicken behavior ===");
        chicken.say();

        System.out.println("\n=== Rooster behavior===");
        rooster.say();
    }
}
