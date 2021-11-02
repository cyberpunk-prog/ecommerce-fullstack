package com.example.demoproject1.controller;

import com.example.demoproject1.pojo.Product;
import com.example.demoproject1.services.ProductServices;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class ProductDetail {
    @Autowired
    private ProductServices emp;

    @RequestMapping(value = "/allProduct",method = RequestMethod.GET)
    public List<Product> ProductDetailOfAll(){

        return emp.allProduct();
    }
//    @RequestMapping(value = "/addProducts",method = RequestMethod.POST)
//    public List<Product> addProductDetailOfAll(@RequestBody List<Product> productListToAdd){
//        return emp.addProduct(productListToAdd);
//    }
    @RequestMapping(value = "/Products",method = RequestMethod.POST)
    public String addProductDetailOfAll(@RequestBody List<Product> ProductToBeAdded )
    {
        emp.addProduct(ProductToBeAdded);
        return "ProductS Added Successfully";
    }
//    @RequestMapping(value = "/Product/{productName}")
//    public Optional<Product> searchProduct(@PathVariable("productName") String productNamecalled )
//    {
//        return emp.getProduct(productNamecalled);
//    }
    @RequestMapping(value = "/Product",method = RequestMethod.POST)
    public String addProduct(@RequestBody Product ProductToBeAdded )
    {
        emp.addProductWithDetails(ProductToBeAdded);
        return "Product Added Successfully";
    }

    @RequestMapping(value = "/Product/{productName}",method = RequestMethod.PUT)
    public String updateProduct(@RequestBody Product ProductToBeUpdated , @PathVariable String productName)
    {
        emp.updateProductWithDetails(ProductToBeUpdated,productName);
        return "Updated Successfully";
    }

    @RequestMapping(value = "/Product",method = RequestMethod.DELETE)
    public String deleteProduct(@RequestBody Product ProductToBeDeleted )
    {
        emp.deleteProduct(ProductToBeDeleted);
        return "Deleted Product";
    }
}
