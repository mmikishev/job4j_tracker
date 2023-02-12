package ru.job4j.early;

public class PassportValidator {

    public static String validate(String password) {
        if (password == null || password.length() == 0) {
            throw new IllegalArgumentException("Пароль пуст");
        }
        if (!checkAbusePass(password)) {
            throw new IllegalArgumentException("Пароль слишком легкий");
        }
        if (password.length() < 8 || password.length() > 32) {
            throw new IllegalArgumentException("Пароль несоответсвует шаблону длины: 8 - 32 символа");
        }
        if (!checkChars(password, 1)) {
            throw new IllegalArgumentException("Добавьте в пароль хотя бы одну строчную будку");
        }
        if (!checkChars(password, 2)) {
            throw new IllegalArgumentException("Добавьте в пароль хотя бы одну прописную будку");
        }
        if (!checkChars(password, 3)) {
            throw new IllegalArgumentException("Добавьте в пароль хотя бы одну цифру");
        }
        if (!checkChars(password, 4)) {
            throw new IllegalArgumentException("Добавьте в пароль хотя бы однин спец. знак");
        }
        return "Пароль валидный";
    }

    public static void main(String[] args) {
        System.out.println(validate("admiiiiiiiiI1n"));
    }

    /*
    private static boolean checkChars(String password, int flag) {
        char[] chars = password.toCharArray();
        boolean[] flags = new boolean[4];
        for (char ch : chars) {
            if (Character.isLowerCase(ch)) {
                flags[0] = true;
            }
            if (Character.isUpperCase(ch)) {
                flags[1] = true;
            }
            if (Character.isDigit(ch)) {
                flags[2] = true;
            }
            if (!Character.isLetterOrDigit(ch)) {
                flags[3] = true;
            }
        }
        return flags[flag];
    }
     */

    private static boolean checkChars(String password, int flag) {
        char[] chars = password.toCharArray();
        for (char ch : chars) {
            switch (flag) {
                case 1:
                    if (Character.isLowerCase(ch)) {
                        return true;
                    }
                    break;
                case 2:
                    if (Character.isUpperCase(ch)) {
                        return true;
                    }
                    break;
                case 3:
                    if (Character.isDigit(ch)) {
                        return true;
                    }
                    break;
                case 4:
                    if (!Character.isLetterOrDigit(ch)) {
                        return true;
                    }
                    break;
                default:
                    throw new IllegalStateException("Несуществующий фаг");
            }
        }
        return false;
    }

    private static boolean checkAbusePass(String password) {
        String[] abuses = {"qwerty", "12345", "password", "admin", "user"};
        String normPass = password.toLowerCase().trim();
        for (String abuse : abuses) {
            if (normPass.contains(abuse)) {
                return false;
            }
        }
        return true;
    }
}