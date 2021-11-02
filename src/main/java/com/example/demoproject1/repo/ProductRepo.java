package com.example.demoproject1.repo;

import com.example.demoproject1.pojo.Product;
import org.springframework.data.repository.CrudRepository;
//all the CRUD operations are already there by CrudRepository

public interface  ProductRepo extends CrudRepository<Product,String> {

}
