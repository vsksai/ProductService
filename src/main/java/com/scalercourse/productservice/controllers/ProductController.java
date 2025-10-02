package com.scalercourse.productservice.controllers;

import com.scalercourse.productservice.exceptions.ProductNotFoundException;
import com.scalercourse.productservice.models.Product;
import com.scalercourse.productservice.services.FakeStoreProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    private FakeStoreProductService productService;

    public ProductController(FakeStoreProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/{productId}")
    public ResponseEntity<Product> getSingleProduct(@PathVariable long productId) throws ProductNotFoundException {
        try {
            Product product = productService.getSinlgeProduct(productId);
            return new ResponseEntity<>(product, HttpStatus.OK);
        } catch (RuntimeException e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("")
    public List<Product> returnAllProducts(){

        return productService.getAllProducts();
    }

    @PostMapping("")
    public Product createProduct(@RequestBody Product product){
        return null;
    }

    @PutMapping("/{productId}")
    public Product replaceProduct(@PathVariable Long productId, @RequestBody Product product){
        return null;
    }

    @DeleteMapping("/{productId}")
    public void deleteProduct(@PathVariable Long productId){

    }
}
