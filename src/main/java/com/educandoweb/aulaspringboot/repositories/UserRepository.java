package com.educandoweb.aulaspringboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.aulaspringboot.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
    
}
