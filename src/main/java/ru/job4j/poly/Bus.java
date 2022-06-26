package ru.job4j.poly;

public class Bus implements Transport {
    @Override
    public void drive() {

    }

    @Override
    public void passengers(int passengers) {
        passengers = 10;
    }

    @Override
    public int refuel(int liter, int price) {
        price = liter * 50;
        return price;
    }
}