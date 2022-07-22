package com.hexaware.za.productservice.controller;

import com.hexaware.za.productservice.component.Product;
import com.hexaware.za.productservice.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductRepository repo;

    @GetMapping("/save")
    public void populate() {
        Product galaxy = new Product(101L, "Galaxy", 1200);
        Product iPhone = new Product(202L, "iPhone 13", 1300);
        Product pixel = new Product(303L, "Pixel", 900);
        repo.save(galaxy);
        repo.save(iPhone);
        repo.save(pixel);
    }

    @GetMapping("/products")
    public List<Product> findAll() {
        return repo.findAll();
    }

    @GetMapping("/products/{id}")
    public Product findById(@PathVariable long id) {
        return repo.findById(id).orElse(null);
    }
}
