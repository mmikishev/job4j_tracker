package ru.job4j.poly;

public class Bus implements Transport {
    @Override
    public String drive() {
        return null;
    }

    @Override
    public int passengers(int passengers) {
        return passengers;
    }

    @Override
    public int refuel(int liter, int price) {
        return price;
    }
}
