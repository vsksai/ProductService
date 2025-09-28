package com.scalercourse.productservice.services;

import com.scalercourse.productservice.models.Product;

import java.util.List;

public interface ProductService {
    List<Product> getAllProducts();
    Product getSinlgeProduct(Long ProductId);
    Product createProduct(Product product);
    Product replaceProduct(Long ProductId, Product product);
}
