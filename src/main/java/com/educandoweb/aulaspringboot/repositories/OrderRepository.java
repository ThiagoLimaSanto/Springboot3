package com.educandoweb.aulaspringboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.educandoweb.aulaspringboot.entities.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long>{
    
}
