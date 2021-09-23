package com.yorosoft.eexpensecrudapi.service.impl;

import com.yorosoft.eexpensecrudapi.model.Category;
import com.yorosoft.eexpensecrudapi.service.CategoryService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryServiceImpl implements CategoryService {


    @Override
    public List<Category> findAll() {
        return null;
    }

    @Override
    public Optional<Category> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public Category save(Category entity) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public Category update(Long id, Category entity) {
        return null;
    }
}
