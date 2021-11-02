package com.example.demoproject1.services;

import com.example.demoproject1.pojo.Product;
import com.example.demoproject1.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class ProductServices {
    @Autowired
    private ProductRepo ProductRepo;
    private List<Product> ProductList=new ArrayList<>();
    public void addProduct(List<Product>  productListToAdd)
    {

        ProductRepo.saveAll(productListToAdd);

    }

    public List<Product> allProduct() {
        List<Product> ls= new ArrayList<>();

         ProductRepo.findAll().forEach(ls::add);
         return ls;
//
//    return ProductList;
    }
    public Optional<Product> getProduct(String productName)
    {
       return ProductRepo.findById(productName);
//        return ProductList.stream().filter(t->t.getproductName().equals(productName)).findFirst();
    }

    public void addProductWithDetails(Product ProductToBeAdded) {
        ProductRepo.save(ProductToBeAdded);
//        ProductList.add(ProductToBeAdded);
    }

    public void updateProductWithDetails(Product ProductToBeUpdated, String productName) {
        ProductRepo.save(ProductToBeUpdated);
//        for(int i=0;i<ProductList.size();i++)
//        {
//            if(ProductList.get(i).getproductName().equals(productName))
//            {
//                ProductList.set(i,ProductToBeUpdated);
//            }
//        }
    }
    public void deleteProduct(Product empl)
    {
        ProductRepo.delete(empl);
    }
   /**
    public static void main(String [] args)
    {
        ProductServices empl=new ProductServices();
        System.out.println(empl.ProductList.get(0));
    }
    */
}
