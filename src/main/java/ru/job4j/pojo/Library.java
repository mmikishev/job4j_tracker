package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book book = new Book("Head First Java", 700);
        Book book1 = new Book("Java. Полное руководство", 800);
        Book book2 = new Book("Java. Библиотека профессионала.", 750);
        Book book3 = new Book("Clean code", 600);
        Book[] books = new Book[4];
        books[0] = book;
        books[1] = book1;
        books[2] = book2;
        books[3] = book3;
        for (int index = 0; index < books.length; index++) {
            Book bo = books[index];
            System.out.println(bo.getName() + " - " + bo.getPages());
        }
        System.out.println("Replace 0 to 3.");
        books[0] = book3;
        books[3] = book;

        for (int index = 0; index < books.length; index++) {
            Book bo = books[index];
            System.out.println(bo.getName() + " - " + bo.getPages());
        }
        System.out.println("цикл с выводом книг с именем \"Clean code\"");
        for (int index = 0; index < books.length; index++) {
            Book bo = books[index];
            if (bo.getName().equals("Clean code")) {
                System.out.println(bo.getName() + " - " + bo.getPages());
            }
        }
    }
}
