package ru.job4j.tracker;

public class Bus implements Vehicle {
    @Override
    public void move() {
        System.out.println("автобус едет по дороге");
    }
}
