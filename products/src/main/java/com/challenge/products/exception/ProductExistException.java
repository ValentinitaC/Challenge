package com.challenge.products.exception;

public class ProductExistException extends RuntimeException{

    public ProductExistException(String message) {
        super(message);
    }

}
