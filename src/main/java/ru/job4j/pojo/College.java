package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFio("Maksim Mikishev");
        student.setGroup(411);
        student.setReceipt(new Date());

        System.out.println(student.getFio() + " группа - " + student.getGroup() + " дата : " + student.getReceipt());
    }
}
