package com.josemneto.cartflow.repositories;

import com.josemneto.cartflow.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
