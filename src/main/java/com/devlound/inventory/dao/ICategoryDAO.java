package com.devlound.inventory.dao;

import com.devlound.inventory.model.Category;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ICategoryDAO extends JpaRepository<Category, Long> {

}
