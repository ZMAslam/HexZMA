package com.hexaware.za.userservice.controller;

import com.hexaware.za.productservice.component.Product;
import com.hexaware.za.userservice.proxy.ProductProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public class UserController {

    @Autowired
    private ProductProxy proxy;

    @GetMapping("home")
    public String home() {
        return "Proxy home";
    }

    @GetMapping("/products")
    public List<Product> findAllProducts() {
        return proxy.findAll();
    }

    @GetMapping("/products/{id}")
    public Product findProduct(@PathVariable long id) {
        return proxy.findById(id);
    }
}
