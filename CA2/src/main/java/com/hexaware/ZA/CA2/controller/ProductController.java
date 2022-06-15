package com.hexaware.ZA.CA2.controller;

import com.hexaware.ZA.CA2.entity.Product;
import com.hexaware.ZA.CA2.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ProductController {

    @Autowired
    private ProductRepo productRepo;

    @GetMapping("/")
    public String home() {
        return "Hello";
    }

    @GetMapping("/products")
    public List<Product> getProducts() {
        return productRepo.findAll();
    }

    @GetMapping("/products/{name}")
    public List<Product> getProductByName(@PathVariable String name) {
        return productRepo.findByName(name);
    }

    @GetMapping("/products/id/{id}")
    public Product getProductById(@PathVariable long id) {
        return productRepo.findById(id).orElse(null);
    }

    @GetMapping("/sale")
    public List<Product> findSales() {
        return productRepo.findSale();
    }

    @DeleteMapping("/delete/{id}")
    public List<Product> deleteById(@PathVariable long id) {
        Product productToDelete = productRepo.findById(id).orElse(null);
        productRepo.delete(productToDelete);
        return productRepo.findAll();

    }

    @PostMapping("/add")
    public Product addProduct(@RequestBody Product product) {
        productRepo.save(product);
        return product;
    }
}
