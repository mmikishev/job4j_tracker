package ru.job4j.tracker;

public class StartUI {
    public static void main(String[] args) {
        Item item = new Item();
        LocalDateTime created = item.getCreated();

        System.out.println("dd-MMMM-EEEE-yyyy HH:mm:ss");
    }
}