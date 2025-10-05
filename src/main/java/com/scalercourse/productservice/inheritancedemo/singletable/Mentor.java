package com.scalercourse.productservice.inheritancedemo.singletable;

import com.scalercourse.productservice.inheritancedemo.mappedsuperclass.User;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@DiscriminatorValue(value="2")
public class Mentor extends User {
    private String company;
    private Double avgrating;
}
