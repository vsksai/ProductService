package com.scalercourse.productservice.exceptions;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter

public class ProductNotFoundException extends Exception{
    private Long productId;

    public ProductNotFoundException(Long productId){
        this.productId = productId;
    }


}
