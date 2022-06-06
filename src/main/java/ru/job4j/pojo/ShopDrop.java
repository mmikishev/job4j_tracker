package ru.job4j.pojo;

public class ShopDrop {
    public static Product[] delete(Product[] products, int index) {
        for (int i = 0; i < products.length; i++) {
            Product product = products[i];
            if (product == null) {
            products[index] = products[index - 1];
            return products;
            }
        }
        return products;
    }
}