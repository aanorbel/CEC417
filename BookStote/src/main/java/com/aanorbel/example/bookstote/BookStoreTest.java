package com.aanorbel.example.bookstote;

public class BookStoreTest {

    public static void main(String[] args) {

        System.out.println("BookStore Book Price Calculator \n");

        BookStore stBookStore = new BookStore(50000, 8);

        System.out.println("PricePerBook " + stBookStore.getPricePerBook());
    }
}
