package ru.job4j.oop;

public class Max {

    public int max(int first, int second) {
        int max = first > second ? first : second;
        return max;
    }

    public int max(int first, int second, int third) {
        return max(first,
                 max(second, third));
    }

    public int max(int first, int second, int third, int fourth) {
        return max(first, second,
                  max(third, fourth));
    }
}