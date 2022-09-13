package com.challenge.products.service;

import com.challenge.products.dto.ProductoDto;

import java.util.List;

public interface ProductoService {

    ProductoDto createProduct(ProductoDto productoDto);

    List<ProductoDto> getAllProducts();

}
