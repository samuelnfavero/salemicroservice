package com.letscode.salems.repository;

import com.letscode.salems.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ProductRespository extends JpaRepository<Product, UUID> {
}
