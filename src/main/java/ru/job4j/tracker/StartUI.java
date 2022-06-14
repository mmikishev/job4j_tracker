package ru.job4j.tracker;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class StartUI {
    public static void main(String[] args) {
        Item item = new Item();
        Item item1 = new Item();
        LocalDateTime created = item.getCreated();
        LocalDateTime created1 = item1.getCreated();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMMM-EEEE-yyyy HH:mm:ss");
        String createdDateTimeFormat = created.format(formatter);
        String created1DateTimeFormat = created1.format(formatter);
        System.out.println(createdDateTimeFormat);
        System.out.println(created1DateTimeFormat);
    }
}
