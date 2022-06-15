package com.hexaware.ZA.CA2.repository;

import com.hexaware.ZA.CA2.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductRepo extends JpaRepository<Product, Long> {
    List<Product> findByName(String name);

    @Query("SELECT p from Product p WHERE p.price < 1000")
    List<Product> findSale();

}
