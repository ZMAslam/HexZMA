package com.hexaware.za.userservice.proxy;

import com.hexaware.za.productservice.component.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name="product-service", url="localhost:8080")
public interface ProductProxy {
    @GetMapping("/products")
    public List<Product> findAll();

    @GetMapping("/products/{id}")
    public Product findById(@PathVariable long id);
}
