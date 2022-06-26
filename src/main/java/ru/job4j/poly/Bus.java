package ru.job4j.poly;

public class Bus implements Transport {
    @Override
    public void drive() {
       System.out.println(" ехает ");
    }

    @Override
    public void passengers(int passengers) {
        passengers = 10;
        System.out.println(passengers + " пассажиров сели ");
    }

    @Override
    public int refuel(int liter, int price) {
        price = liter * 50;
        System.out.println("сумма заправки " + price);
        return price;
    }
}