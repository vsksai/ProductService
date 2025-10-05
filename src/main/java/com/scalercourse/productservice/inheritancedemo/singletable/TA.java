package com.scalercourse.productservice.inheritancedemo.singletable;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@DiscriminatorValue(value="3")
public class TA extends User {
    private Double avgRating;
    private int numberofHelpRequests;
}
