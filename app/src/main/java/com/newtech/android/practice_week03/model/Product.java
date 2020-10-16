package com.newtech.android.practice_week03.model;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;

public class Product {
    private String productId;
    private String productName;
    private String provider;
    private float rating;
    private double price;
    private int discount;
    private int image;

    public Product(String productId, String productName, float rating, double price, int discount, int image) {
        this.productId = productId;
        this.productName = productName;
        this.rating = rating;
        this.price = price;
        this.discount = discount;
        this.image = image;
    }

    public Product(String productId, String productName, String provider, float rating, double price, int image) {
        this.productId = productId;
        this.productName = productName;
        this.provider = provider;
        this.rating = rating;
        this.price = price;
        this.image = image;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }
}
