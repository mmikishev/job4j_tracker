package ru.job4j.oop;

public class Calculator {

    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public int multiply(int a) {
        return x * a;
    }

    public static int minus(int b) {
        return b - x;
    }

    public int divide(int c) {
        return c / x;
    }

    public int sumAllOperation(int d) {
        return d;
    }

    public static void main(String[] args) {
        int result = Calculator.sum(10);
        int resultb = Calculator.minus(10);

        Calculator calculator = new Calculator();
        int rsl = calculator.multiply(5);
        Calculator calculator1 = new Calculator();
        int rsl1 = calculator1.divide(25);
        Calculator calculator2 = new Calculator();
        int rsl2 = calculator2.sumAllOperation(result + resultb + rsl + rsl1);
        System.out.println(result);
        System.out.println(resultb);
        System.out.println(rsl);
        System.out.println(rsl1);
        System.out.println(rsl2);
    }
}