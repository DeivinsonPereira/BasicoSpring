package com.devsuperior.springbasico.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.springbasico.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
