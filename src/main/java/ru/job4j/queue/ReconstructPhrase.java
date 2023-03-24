package ru.job4j.queue;

import java.util.Deque;
import java.util.Iterator;

public class ReconstructPhrase {

    private final Deque<Character> descendingElements;

    private final Deque<Character> evenElements;

    public ReconstructPhrase(Deque<Character> descendingElements, Deque<Character> evenElements) {
        this.descendingElements = descendingElements;
        this.evenElements = evenElements;
    }

    private String getEvenElements() {
        int size = evenElements.size();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            if (i % 2 == 0) {
                sb.append(evenElements.peekFirst());
            }
            evenElements.pollFirst();
        }
        return sb.toString();
    }

    private String getDescendingElements() {
        Iterator<Character> iterator = descendingElements.descendingIterator();
        StringBuilder str = new StringBuilder();
        while (iterator.hasNext()) {
            str.append(iterator.next());
        }
        return str.toString();
    }

    public String getReconstructPhrase() {
        return getEvenElements() + getDescendingElements();
    }
}