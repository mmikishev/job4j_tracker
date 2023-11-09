package ru.job4j.tracker;

import java.util.Comparator;

public class ItemAscByName implements Comparator<Item> {

    @Override
    public int compare(Item items1, Item items2) {
        return items1.getName().compareTo(items2.getName());
    }
}
