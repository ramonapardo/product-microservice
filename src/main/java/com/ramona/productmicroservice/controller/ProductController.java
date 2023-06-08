package com.ramona.productmicroservice.controller;

import com.ramona.productmicroservice.entity.ProductEntity;
import com.ramona.productmicroservice.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/ramona/products")
public class ProductController {

    @Autowired
    ProductRepository pRepo;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<ProductEntity> getAllProducts(){
        return pRepo.findAll();
    }

//    @GetMapping
//    @ResponseStatus(HttpStatus.OK)
//    public ResponseEntity<List<ProductEntity>> getAllProducts2(){
//        List<ProductEntity> productEntities = pRepo.findAll();
//        return new ResponseEntity<>(productEntities, HttpStatus.OK);
//    }

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public void createProduct(@RequestBody ProductEntity productEntity){
        pRepo.save(productEntity);

    }

}
