package com.challenge.products.service;

import com.challenge.products.domain.Producto;
import com.challenge.products.dto.ProductoDto;

import java.util.List;

public interface ProductoService {

    Producto createProduct(ProductoDto productoDto);

    List<Producto> getAllProducts();

    Producto getProductBySku(Long sku);

    Producto updateProducto(Long sku, ProductoDto producto);

}
