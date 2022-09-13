package com.challenge.products.domain;

import lombok.Data;

@Data
public class Producto {
    private Long sku;
    private String name;
    private String brand;
    private String size;
    private String price;
}
