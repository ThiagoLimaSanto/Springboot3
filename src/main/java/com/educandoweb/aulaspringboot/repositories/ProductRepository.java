package com.educandoweb.aulaspringboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.educandoweb.aulaspringboot.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
