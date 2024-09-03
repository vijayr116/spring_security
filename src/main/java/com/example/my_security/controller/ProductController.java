package com.example.my_security.controller;

import com.example.my_security.model.Product;
import com.example.my_security.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;
    @PostMapping("/add")
    public Product addProduct(@RequestBody Product product){
        return productService.addProduct(product);
    }

    @GetMapping("getAll")
    public List<Product> getAllProduct(){
        return productService.getAllProducts();
    }

}
