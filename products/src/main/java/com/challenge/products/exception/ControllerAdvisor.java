package com.challenge.products.exception;

import com.challenge.products.domain.ErrorMessage;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class ControllerAdvisor extends ResponseEntityExceptionHandler {

    @ExceptionHandler(ProductExistException.class)
    public ErrorMessage productExist (Exception e){
        return new ErrorMessage(HttpStatus.BAD_REQUEST,e.getMessage());
    }
}
