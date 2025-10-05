package com.scalercourse.productservice;

import com.scalercourse.productservice.models.Product;
import com.scalercourse.productservice.projections.ProductWithtitleAndPrice;
import com.scalercourse.productservice.repositories.ProductRepository;
import com.scalercourse.productservice.services.ProductService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;

@SpringBootTest
class ProductServiceApplicationTests {
     @Autowired
     private ProductRepository productRepository;

    @Test
    void contextLoads() {
    }

    @Test
    public void testQuery(){
        List<ProductWithtitleAndPrice> productWithtitleAndPriceList = productRepository.findTitleAndPriceById();
        for(ProductWithtitleAndPrice productWithtitleAndPrice : productWithtitleAndPriceList){
            System.out.println(productWithtitleAndPrice.getTitle()+" "+productWithtitleAndPrice.getPrice());


        }

        Optional<Product> optionalProduct = productRepository.findByCategory_Title("mobile");
        System.out.println(optionalProduct.get().getPrice());
    }
}
