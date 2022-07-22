package com.hexaware.za.productservice.repository;

import com.hexaware.za.productservice.component.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
