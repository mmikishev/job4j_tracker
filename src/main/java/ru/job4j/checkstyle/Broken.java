package ru.job4j.checkstyle;

public class Broken {

    private int sizeOfEmpty = 10;

    public String surname;

    private String name;

    public Broken() { }

    public static final String NEWVALUE = "";

    public void echo() { }

    public void media(Object obj) {
        if (obj != null) {
            System.out.println(obj);
        }
    }

    public void method(int a, int b, int c, int d, int e, int f, int g) {
    }

}