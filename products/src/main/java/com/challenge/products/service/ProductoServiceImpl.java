package com.challenge.products.service;

import com.challenge.products.domain.Producto;
import com.challenge.products.dto.ProductoDto;
import com.challenge.products.exception.ProductExistException;
import com.challenge.products.exception.ProductNotFoundException;
import com.challenge.products.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductoServiceImpl implements ProductoService{

    private static final String INICIAL_MESSAGE = "Producto ";
    
    @Autowired
    private ProductoRepository productoRepository;
    @Override
    public Producto createProduct(ProductoDto productoDto) {
        Producto producto1 = productoRepository.findByName(productoDto.getName());
        if (producto1 != null){
            throw new ProductExistException(INICIAL_MESSAGE + productoDto.getName() + " ya existente.");
        }else {
            Producto productToAdd = new Producto();
            productToAdd.setSku(productoDto.getSku());
            productToAdd.setName(productoDto.getName());
            productToAdd.setBrand(productoDto.getBrand());
            productToAdd.setSize(productoDto.getSize());
            productToAdd.setPrice(productoDto.getPrice());
            return productoRepository.save(productToAdd);
        }
    }

    @Override
    public List<Producto> getAllProducts() {
        return productoRepository.findAll();
    }

    @Override
    public Producto getProductBySku(Long sku) {
        Producto prod = productoRepository.findBySku(sku);
        if (prod == null){
            throw new ProductNotFoundException(INICIAL_MESSAGE + sku + " no se encuentra");
        }else{
            return productoRepository.findBySku(sku);
        }
    }

    @Override
    public Producto updateProducto(Long sku, ProductoDto producto) {
        Producto prod = productoRepository.findBySku(sku);
        if (prod == null){
            throw new ProductNotFoundException(INICIAL_MESSAGE + sku + " no se encuentra.");
        }else {
            return null;
        }    
    }
}
