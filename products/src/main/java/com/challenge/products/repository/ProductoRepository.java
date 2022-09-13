package com.challenge.products.repository;

import com.challenge.products.dto.ProductoDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProductoRepository extends JpaRepository<ProductoDto,Long> {

    ProductoDto findByName(String name);

}
