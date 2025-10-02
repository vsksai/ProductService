package com.scalercourse.productservice.services;

import com.scalercourse.productservice.exceptions.ProductNotFoundException;
import com.scalercourse.productservice.models.Product;

import java.util.List;

public interface ProductService {
    List<Product> getAllProducts();
    Product getSinlgeProduct(Long ProductId) throws ProductNotFoundException;
    Product createProduct(Product product);
    Product replaceProduct(Long ProductId, Product product);
}
