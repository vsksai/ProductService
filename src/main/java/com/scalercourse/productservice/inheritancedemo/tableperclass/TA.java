package com.scalercourse.productservice.inheritancedemo.tableperclass;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name="tbc_tas")
public class TA extends User {
    private Double avgRating;
    private int numberofHelpRequests;
}
