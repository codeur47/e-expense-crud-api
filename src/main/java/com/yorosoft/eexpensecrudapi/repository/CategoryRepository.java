package com.yorosoft.eexpensecrudapi.repository;

import com.yorosoft.eexpensecrudapi.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> { }
