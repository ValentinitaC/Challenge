package com.challenge.products.service;

import com.challenge.products.dto.ProductoDto;
import com.challenge.products.exception.ProductExistException;
import com.challenge.products.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoServiceImpl implements ProductoService{

    @Autowired
    private ProductoRepository productoRepository;
    @Override
    public ProductoDto createProduct(ProductoDto productoDto) {
        ProductoDto producto1 = productoRepository.findByName(productoDto.getName());
        if (producto1 != null){
            throw new ProductExistException("Producto " + productoDto.getName() + " ya existente.");
        }else {
            return productoRepository.save(productoDto);
        }
    }

    @Override
    public List<ProductoDto> getAllProducts() {
        return productoRepository.findAll();
    }
}
