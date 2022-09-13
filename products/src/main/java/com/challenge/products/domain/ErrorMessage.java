package com.challenge.products.domain;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

@AllArgsConstructor
@NoArgsConstructor
public class ErrorMessage {
    private HttpStatus code;
    private String message;
}
