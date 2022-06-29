package ru.job4j.tracker;

public class Airplane implements Vehicle {
    @Override
    public void move() {
        System.out.println("самолет летит по поздуху");
    }
}
