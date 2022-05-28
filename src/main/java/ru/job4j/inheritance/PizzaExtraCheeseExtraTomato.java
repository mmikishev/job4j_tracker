package ru.job4j.inheritance;

public class PizzaExtraCheeseExtraTomato extends PizzaExtraCheese {
    private static final String EXTRA_TOMATO = "extra tomato";

    @Override
    public String name() {
        return EXTRA_TOMATO + super.name();
    }
}
