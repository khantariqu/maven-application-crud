package com.javatechie.mavenapplicationcrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javatechie.mavenapplicationcrud.entity.Product;

public interface ProductRepository extends JpaRepository<Product,Integer> {

}
