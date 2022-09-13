package com.challenge.products.exception;

import com.challenge.products.domain.ErrorMessage;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class ControllerAdvisor extends ResponseEntityExceptionHandler {
    private static final int BAD_REQUEST_CODE = 2000;
    private static final int NOT_FOUND_CODE = 3000;

    @ExceptionHandler(ProductExistException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public @ResponseBody ErrorMessage productExist (Exception e){
        return new ErrorMessage(BAD_REQUEST_CODE, e.getMessage());
    }

    @ExceptionHandler(ProductNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public @ResponseBody ErrorMessage productNotFound (Exception e){
        return new ErrorMessage(NOT_FOUND_CODE, e.getMessage());
    }
}
