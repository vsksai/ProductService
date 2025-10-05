package com.scalercourse.productservice.inheritancedemo.joinedtable;

import com.scalercourse.productservice.inheritancedemo.mappedsuperclass.User;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name="jt_mentors")
public class Mentor extends User {
    private String company;
    private Double avgrating;
}
