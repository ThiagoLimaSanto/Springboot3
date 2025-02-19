package com.educandoweb.aulaspringboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.educandoweb.aulaspringboot.entities.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

}
