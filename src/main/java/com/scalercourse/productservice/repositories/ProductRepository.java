package com.scalercourse.productservice.repositories;

import com.scalercourse.productservice.models.Product;
import com.scalercourse.productservice.projections.ProductWithtitleAndPrice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    //Declared Queries-- Read


    @Override
    Optional<Product> findById(Long aLong);// Optional bucket saves from NPE

    @Override
    List<Product> findAll();

   List<Product> findByTitle(String title);

   List<Product> findByTitleIgnoreCase(String title);

   List<Product> findByPriceBetween(Double priceAfter, Double priceBefore);

   //Declared Quereis -- Delete

    @Override
    void deleteById(Long aLong);

    //Declared Queries -- Update and Save

    Product save(Product product);

    @Query(value = "select p.title, p.price from products p where p.id=5", nativeQuery = true)
    List<ProductWithtitleAndPrice> findTitleAndPriceById();

    //Making Hibernate Write the join Query, eg, give me all products where category=iphone, so
    //it should join product and category.

    Optional<Product> findByCategory_Title(String title);

}
