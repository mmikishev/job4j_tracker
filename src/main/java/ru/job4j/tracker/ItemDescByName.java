package ru.job4j.tracker;

import java.util.Comparator;

public class ItemDescByName implements Comparator<Item> {
    @Override
    public int compare(Item items1, Item items2) {
        return items2.getName().compareTo(items1.getName());
    }
}
