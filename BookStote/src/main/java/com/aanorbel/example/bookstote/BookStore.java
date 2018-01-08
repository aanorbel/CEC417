package com.aanorbel.example.bookstote;

public class BookStore {

    public static final int SHIPPING_CHARGE_PER_BOOK = 5;
    public static final double TAX_PERCENT = 7.5 / 100;

    private double totalPrice;
    private int numberOfBooks;

    public BookStore(double totalPrice, int numberOfBooks) {
        this.totalPrice = totalPrice;
        this.numberOfBooks = numberOfBooks;
    }

    public double getPricePerBook() {
        double tax = TAX_PERCENT * this.totalPrice;
        double shippingCharge = SHIPPING_CHARGE_PER_BOOK * this.numberOfBooks;

        return (this.totalPrice + shippingCharge + tax) / this.numberOfBooks;
    }
}
