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
    private double salary;

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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }




    public Product() {
    }

    public Product(String productName, String managerproductName, String imgURL, double salary) {
        this.productName = productName;
        this.imgURL = managerproductName;
        this.imgURL = imgURL;
        this.salary = salary;
    }



    @Override
    public String toString() {
        return "{" +
                "productName='" + productName + '\'' +
                ", managerproductName='" + imgURL + '\'' +
                ", designation='" + details + '\'' +
                ", salary=" + salary +
                '}';
    }

}
