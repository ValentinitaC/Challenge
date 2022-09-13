package com.challenge.products.repository;

import com.challenge.products.domain.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProductoRepository extends JpaRepository<Producto,Long> {

    Producto findByName(String name);

    Producto findBySku(Long sku);

}
