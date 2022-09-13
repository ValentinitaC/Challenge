package com.challenge.products.dto;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "productos")
public class ProductoDto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long sku;
    @Column(name = "name")
    private String name;
    @Column(name = "brand")
    private String brand;
    @Column(name = "size")
    private String size;
    @Column(name = "price")
    private String price;
}
