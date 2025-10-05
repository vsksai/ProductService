package com.scalercourse.productservice.inheritancedemo.tableperclass;

import com.scalercourse.productservice.inheritancedemo.mappedsuperclass.User;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name="tbc_mentors")
public class Mentor extends User {
    private String company;
    private Double avgRating;
}
