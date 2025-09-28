package com.scalercourse.productservice.services;

import com.scalercourse.productservice.dtos.FakeStoreProductDto;
import com.scalercourse.productservice.models.Category;
import com.scalercourse.productservice.models.Product;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


import java.util.List;

@Service
public class FakeStoreProductService implements ProductService {
    private RestTemplate restTemplate;

    public FakeStoreProductService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }


    @Override
    public List<Product> getAllProducts() {
        return List.of();
    }

    @Override
    public Product getSinlgeProduct(Long ProductId) {

        ResponseEntity<FakeStoreProductDto> responseEntity = restTemplate.getForEntity("https://fakestoreapi.com/products/" + ProductId, FakeStoreProductDto.class);

        FakeStoreProductDto fakeStoreProductDto = responseEntity.getBody();

        return convertFakeStoreProductDtoToProduct(fakeStoreProductDto);
    }

    @Override
    public Product createProduct(Product product) {
        return null;
    }

    @Override
    public Product replaceProduct(Long ProductId, Product product) {
        return null;
    }

    private Product convertFakeStoreProductDtoToProduct(FakeStoreProductDto fakeStoreProductDto) {

        if (fakeStoreProductDto.getId() == null) {
            return null;
        }

        Product product = new Product();
        product.setId(fakeStoreProductDto.getId());
        product.setPrice(fakeStoreProductDto.getPrice());
        product.setTitle(fakeStoreProductDto.getTitle());
        product.setDescription(fakeStoreProductDto.getDescription());
        product.setImageUrl(fakeStoreProductDto.getImage());

        Category category = new Category();
        category.setTitle(fakeStoreProductDto.getCategory());
        product.setCategory(category);
        return product;
    }
}
