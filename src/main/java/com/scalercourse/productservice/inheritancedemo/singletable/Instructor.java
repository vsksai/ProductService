package com.scalercourse.productservice.inheritancedemo.singletable;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name="st_instructors")// table will not get created as seprate table as it is single table
@DiscriminatorValue(value="1")
public class Instructor extends User {
    private String company;
    private Double avgRating;
}
