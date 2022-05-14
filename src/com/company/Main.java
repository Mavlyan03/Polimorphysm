package com.company;

public class Main {
    public static void main(String[] args) {
        Animal[] animal = {new Shark(), new Turtle(), new Eagle()};
        Shark[] shark = new Shark[0];
        Turtle[] turtle = new Turtle[1];
        Eagle[] eagle = new Eagle[2];

        Animal animals = new Animal();
        System.out.println(animals.eat());

        for (int i = 0; i < animal.length; i++) {
            if (animal[i] instanceof Shark) {
                ((Shark) animal[i]).attack();
            }
            if (animal[i] instanceof Turtle) {
                ((Turtle) animal[i]).swim();
            }
            if (animal[i] instanceof Eagle) {
                ((Eagle) animal[i]).fly();
            }
        }
    }
}
