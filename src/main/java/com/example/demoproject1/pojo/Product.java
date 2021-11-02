package com.example.demoproject1.pojo;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.ArrayList;
import java.util.List;
@Entity
public class Product {
    @Id
    private String productName;
    private String imgURL;
    private String details;
    private double price;

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getImgURL() {
        return imgURL;
    }

    public void setImgURL(String imgURL) {
        this.imgURL = imgURL;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public double getprice() {
        return price;
    }

    public void setprice(double price) {
        this.price = price;
    }




    public Product() {
    }

    public Product(String productName, String managerproductName, String imgURL, double price) {
        this.productName = productName;
        this.imgURL = managerproductName;
        this.imgURL = imgURL;
        this.price = price;
    }



    @Override
    public String toString() {
        return "{" +
                "productName='" + productName + '\'' +
                ", managerproductName='" + imgURL + '\'' +
                ", designation='" + details + '\'' +
                ", price=" + price +
                '}';
    }

}
