package com.company;

public class Turtle extends Animal {
    private int[] array;
    public Turtle() {
        this.array = array;
    }
    public void swim() {
        System.out.println("Turtles swim in the oceans and seas");
    }
    @Override
    public String eat() {
        return "Turtles eat seaweed and other plants";
    }
}
