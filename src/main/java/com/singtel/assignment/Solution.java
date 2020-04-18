package com.singtel.assignment;

import com.singtel.assignment.domain.*;

import java.util.function.Predicate;


public class Solution {

    public static void main(String[] args) {
        Animal[] animals = new Animal[]{
                new Bird(),
                new Duck(),
                new Chicken(),
                new Rooster(),
                new Parrot(),
                new Fish(),
        };

        System.out.println("Number of animals can fly: " + count(animals, animal -> animal.getFlyBehavior() != null));
        System.out.println("Number of animals can sing: " + count(animals, animal -> animal.getSingBehavior() != null));
        System.out.println("Number of animals can walk: " + count(animals, animal -> animal.getWalkBehavior() != null));
        System.out.println("Number of animals can swim: " + count(animals, animal -> animal.getSwimBehavior() != null));
    }

    public static int count(Animal[] animals, Predicate<Animal> predicate) {
        int count = 0;
        for(Animal animal : animals) {
            if(predicate.test(animal)) {
                count++;
            }
        }

        return count;
    }
}
