package ru.job4j.tracker;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class ItemDescByNameTest {
    @Test
    public void whenSortListByDescComparator() {
        Item item0 = new Item(0, "nadya");
        Item item1 = new Item(1, "sasha");
        Item item2 = new Item(2, "zoja");
        Item item3 = new Item(3, "galya");
        List<Item> items = Arrays.asList(item0, item1, item2, item3);
        items.sort(new ItemDescByName());
        List<Item> expected = Arrays.asList(item2, item1, item0, item3);
        assertThat(items).containsExactlyElementsOf(expected);
    }
}
