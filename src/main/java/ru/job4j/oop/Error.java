package ru.job4j.oop;

public class Error {

    private boolean active;
    private int status;
    private String message;

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void printInfo() {
        System.out.println("активно " + active);
        System.out.println("статус " + status);
        System.out.println("сообщение " + message);
    }

    public Error() {
    }

    public static void main(String[] args) {
        Error error = new Error(true, 3, "ошибка");
        error.printInfo();
        Error error1 = new Error();
        error1.printInfo();
    }
}
