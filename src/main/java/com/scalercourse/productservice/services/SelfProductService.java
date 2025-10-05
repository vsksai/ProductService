package com.scalercourse.productservice.services;

import com.scalercourse.productservice.exceptions.ProductNotFoundException;
import com.scalercourse.productservice.models.Category;
import com.scalercourse.productservice.models.Product;
import com.scalercourse.productservice.repositories.CategoryRepository;
import com.scalercourse.productservice.repositories.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("selfProductService")
public class SelfProductService implements ProductService {
    private ProductRepository productRepository;
    private CategoryRepository categoryRepository;

    public SelfProductService(ProductRepository productRepository, CategoryRepository categoryRepository) {
        this.productRepository = productRepository;
        this.categoryRepository = categoryRepository;
    }

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product getSinlgeProduct(Long ProductId) throws ProductNotFoundException {

        productRepository.findById(ProductId);
        Optional<Product> optionalProduct = productRepository.findById(ProductId);

        if(optionalProduct.isPresent()){
            throw new ProductNotFoundException(ProductId);
        }
        return optionalProduct.get();
    }

    @Override
    public Product createProduct(Product product) {
        // Can implement Validations if necessary

        Category category = product.getCategory();
        Optional<Category> optionalCategory = categoryRepository.findByTitle(category.getTitle());
        if(optionalCategory.isEmpty()){
            // save a category and set the new category from repo to product
            Category savedCategory = categoryRepository.save(category);
            product.setCategory(savedCategory);
        }

        return productRepository.save(product);
    }

    @Override
    public Product replaceProduct(Long ProductId, Product product) {
        return null;
    }
}
