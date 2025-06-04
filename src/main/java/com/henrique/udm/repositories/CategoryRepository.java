package com.henrique.udm.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.henrique.udm.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
