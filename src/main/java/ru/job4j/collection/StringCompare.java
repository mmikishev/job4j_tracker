package ru.job4j.collection;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {

    @Override
    public int compare(String left, String right) {
        int res = 0;
        int minLenth = Math.min(left.length(), right.length());
        for (int i = 0; i < minLenth; i++) {
            res = Character.compare(left.charAt(i), right.charAt(i));
            if (res != 0) {
                break;
            }
        }
        return res != 0 ? res : Integer.compare(left.length(), right.length());
    }
}