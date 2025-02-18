package com.educandoweb.aulaspringboot.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.aulaspringboot.entities.Category;
import com.educandoweb.aulaspringboot.repositories.CategoryRepository;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository repository;

    public List<Category> findAll() {
        return repository.findAll();
    }

    public Category findByID(Long id) {
        Optional<Category> obj = repository.findById(id);
        return obj.get();
    }
}
