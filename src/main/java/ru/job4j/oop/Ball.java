package ru.job4j.oop;

public class Ball {
    public void tryRun(boolean condition) {
        if (condition) {
            System.out.println("колобок съеден");
        } else {
            System.out.println("колобок сбежал");
        }
    }

    public static void main(String[] args) {
        Hare hare = new Hare();
        Wolf wolf = new Wolf();
        Fox fox = new Fox();
        Ball ball = new Ball();
        hare.tryEat(ball);
        wolf.tryEat(ball);
        fox.tryEat(ball);
    }
}
