package ru.job4j.tracker;

public class Train implements Vehicle {
    @Override
    public void move() {
        System.out.println("поезд стучит по рельсам");
    }
}
