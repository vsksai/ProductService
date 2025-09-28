package com.scalercourse.productservice.controllers;

import com.scalercourse.productservice.models.Product;
import com.scalercourse.productservice.services.FakeStoreProductService;
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
    public Product getSingleProduct(@PathVariable long productId){
        return productService.getSinlgeProduct(productId);
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
