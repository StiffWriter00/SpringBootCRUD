package com.ready2use.crud.repository;

import com.ready2use.crud.entity.Product;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Integer>{

    public List<Product> findByName(String name);

    public boolean existsByName(String name);

    @Query("select max (p.id) from Product p")
    public Integer findMaxId();

}
