package com.scalercourse.productservice.inheritancedemo.joinedtable;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name="jt_tas")
public class TA extends User {
    private Double avgRating;
    private int numberofHelpRequests;
}
