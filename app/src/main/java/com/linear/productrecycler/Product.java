package com.linear.productrecycler;

import android.util.Log;
import android.widget.Toast;

import java.io.Serializable;

public class Product implements Serializable {
    private String name;
    private String productName;
    private String price;

    public Product() {
    }

    public Product(String name, String productName, String price) {
        this.name = name;
        this.productName =productName ;
        this.price=price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
