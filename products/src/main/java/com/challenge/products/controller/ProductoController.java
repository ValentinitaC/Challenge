package com.challenge.products.controller;

import com.challenge.products.dto.ProductoDto;
import com.challenge.products.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/productos")
public class ProductoController {

    @Autowired
    private ProductoService productoService;

    @PostMapping("/agregar-producto")
    @ResponseStatus(HttpStatus.OK)
    public ProductoDto addProduct(@RequestBody ProductoDto productoDto){
        return productoService.createProduct(productoDto);
    }

    @GetMapping("/obtener-productos")
    public List<ProductoDto> getProducts(){
        return productoService.getAllProducts();
    }

}
