package com.example.my_security.service;

import com.example.my_security.model.Product;
import com.example.my_security.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
@Autowired
private ProductRepo productRepo;
    public Product addProduct(Product product) {
        return productRepo.save(product);
    }

    public List<Product> getAllProducts() {
        return productRepo.findAll();
    }
}
