package ru.job4j.collection;

import java.util.HashSet;

public class UniqueText {
    @SuppressWarnings("checkstyle:WhitespaceAround")
    public boolean isEquals(String originText, String duplicateText) {
        boolean rsl = true;
        String[] origin = originText.split(" ");
        String[] text = duplicateText.split(" ");
        HashSet<String> check = new HashSet<>();
        for (String words : origin) {
            check.add(words);
        }
        for (String words : text) {
            if (!check.contains(words)) {
               rsl = false;
            }
        }
        /* for-each origin -> new HashSet. */
        /* for-each text -> hashSet.contains */
        return rsl;
    }
}