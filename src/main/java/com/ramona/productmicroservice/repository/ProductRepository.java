package com.ramona.productmicroservice.repository;

import com.ramona.productmicroservice.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<ProductEntity, String> {



}
