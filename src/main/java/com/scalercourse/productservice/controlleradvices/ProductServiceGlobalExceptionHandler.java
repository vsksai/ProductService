package com.scalercourse.productservice.controlleradvices;

import com.scalercourse.productservice.exceptions.ProductNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ProductServiceGlobalExceptionHandler {
    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<Void> handleRuntimeException(){
        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(NullPointerException.class)
    public ResponseEntity<String> handleNullPointerException(){
        return new ResponseEntity<>("Please try with valid input", HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(ProductNotFoundException.class)
    public ResponseEntity<String> handleProductNotFoundException(ProductNotFoundException productNotFoundException){
        return new ResponseEntity<>(productNotFoundException.getProductId() +"is an invalid product",
                HttpStatus.NOT_FOUND);
    }
}
