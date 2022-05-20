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
        int resultb = Calculator.minus(15);

        Calculator calculator = new Calculator();
        int rsl = calculator.multiply(5);
        int rsl1 = calculator.divide(25);
        int rsl2 = calculator.sumAllOperation(result + rsl + resultb + rsl1);
        System.out.println(result);
        System.out.println(resultb);
        System.out.println(rsl);
        System.out.println(rsl1);
        System.out.println(rsl2);
    }
}