package com.scalercourse.productservice.inheritancedemo.mappedsuperclass;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name="msc_instructors")
public class Instructor extends User{
    private String company;
    private Double avgRating;
}
