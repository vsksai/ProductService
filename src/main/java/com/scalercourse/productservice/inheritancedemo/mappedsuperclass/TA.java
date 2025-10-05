package com.scalercourse.productservice.inheritancedemo.mappedsuperclass;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name="msc_tas")
public class TA extends User{
    private Double avgRating;
    private int numberofHelpRequests;
}
