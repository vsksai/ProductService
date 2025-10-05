package com.scalercourse.productservice.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name="products")
//@Entity(name="products")--to name a table different from class name
public class Product extends BaseModel{
    //@Column(nullable = false, unique = true) -- to impose column constraints
    private String title;
    private Double price;
    private String description;
    private String imageUrl;

    @ManyToOne
    private Category category;

}
